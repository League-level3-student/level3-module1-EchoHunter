package _07_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 *          
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api 
 */

public class CaliforniaWeather implements ActionListener {
    JButton getCityWeather = new JButton();
    JButton getConditionList = new JButton();
    JButton getMaxAndMinTemp = new JButton();
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    
    HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
    String cityName = "";
    WeatherData datum = weatherData.get(cityName);
    void start() {
        getCityWeather.addActionListener(this);
        getConditionList.addActionListener(this);
        getMaxAndMinTemp.addActionListener(this);
        panel.add(getCityWeather);
        panel.add(getConditionList);
        panel.add(getMaxAndMinTemp);
        frame.add(panel);
        frame.setSize(500,250);
        frame.setVisible(true);
        // All city keys have the first letter capitalized of each word
        
       
        
        
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == getCityWeather) { 
			cityName = JOptionPane.showInputDialog("Which city would you like to check? (the first letter of every word should be capitalized)");
			datum = weatherData.get(cityName);
			if( datum == null ) {
	            JOptionPane.showMessageDialog(null,"Unable to find weather data for: " + cityName);
	        } else {
	            JOptionPane.showMessageDialog(null,cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
	        }
	}
		if(e.getSource() == getConditionList) {
			String condition = JOptionPane.showInputDialog("What Conditions are you looking for? (the first letter of every word should be capitalized)");
			for (String w: weatherData.keySet()) {
				
			}
			
			}
		if(e.getSource() == getMaxAndMinTemp) {
			
		}
	}
}
