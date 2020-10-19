package io.fyp.fypapi.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class DataService {

	private String csvFile = "F:\\ACADEMIC\\Semester 7\\CO 421 CO 425 Final Year Project\\Project\\fyp-dataset-api\\API-Testbed\\src\\main\\java\\io\\fyp\\fypapi\\DataSetSal.csv";
	private String line = "";
	private String cvsSplitBy = ",";
    
	private ArrayList<Double> time = new ArrayList<Double>();
	private ArrayList<Double> vehicle_speed = new ArrayList<Double>();
	private ArrayList<Double> shift_number = new ArrayList<Double>();
	private ArrayList<Double> engine_load = new ArrayList<Double>();
	private ArrayList<Double> total_acceleration = new ArrayList<Double>();
	private ArrayList<Double> engine_rpm = new ArrayList<Double>();
	private ArrayList<Double> pitch = new ArrayList<Double>();
	private ArrayList<Double> lateral_acceleration = new ArrayList<Double>();
	private ArrayList<Double> passenger_count = new ArrayList<Double>();
	private ArrayList<Double> cars_load = new ArrayList<Double>();
	private ArrayList<Double> air_condition_status = new ArrayList<Double>();
	private ArrayList<Double> window_opening = new ArrayList<Double>();
	private ArrayList<Double> radio_volume = new ArrayList<Double>();
	private ArrayList<Double> rain_intensity = new ArrayList<Double>();
	private ArrayList<Double> visibility = new ArrayList<Double>();
	private ArrayList<Double> drivers_wellbeing = new ArrayList<Double>();
	private ArrayList<Double> driver_rush = new ArrayList<Double>();

    {
	    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	
	        while ((line = br.readLine()) != null) {
	
	            // use comma as separator
	        	
	            String[] data = line.split(cvsSplitBy);
//	            System.out.println(data[0]);
	            
	            time.add(Double.parseDouble(data[0]));
	            vehicle_speed.add(Double.parseDouble(data[1]));
	            shift_number.add(Double.parseDouble(data[2]));
	            engine_load.add(Double.parseDouble(data[3]));
	            total_acceleration.add(Double.parseDouble(data[4]));
	            engine_rpm.add(Double.parseDouble(data[5]));
	            pitch.add(Double.parseDouble(data[6]));
	            lateral_acceleration.add(Double.parseDouble(data[7]));
	            passenger_count.add(Double.parseDouble(data[8]));
	            cars_load.add(Double.parseDouble(data[9]));
	            air_condition_status.add(Double.parseDouble(data[10]));
	            window_opening.add(Double.parseDouble(data[11]));
	            radio_volume.add(Double.parseDouble(data[12]));
	            rain_intensity.add(Double.parseDouble(data[13]));
	            visibility.add(Double.parseDouble(data[14]));
	            drivers_wellbeing.add(Double.parseDouble(data[15]));
	            driver_rush.add(Double.parseDouble(data[16]));
	            	
	        }
	
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
    }

	
    public ArrayList<Double> getData(String id, int count) {
//		System.out.println(count);
		switch(id) {
			case "time":
				return new ArrayList<Double>(time.subList(count * 5, (count * 5) + 5));
			case "vehicleSpeed":
				return new ArrayList<Double>(vehicle_speed.subList(count * 5, (count * 5) + 5));
			case "shiftNumber":
				return new ArrayList<Double>(shift_number.subList(count * 5, (count * 5) + 5));
			case "engineLoad":
				return new ArrayList<Double>(engine_load.subList(count * 5, (count * 5) + 5));
			case "totalAcceleration":
				return new ArrayList<Double>(total_acceleration.subList(count * 5, (count * 5) + 5));
			case "engineRPM":
				return new ArrayList<Double>(engine_rpm.subList(count * 5, (count * 5) + 5));
			case "pitch":
				return new ArrayList<Double>(pitch.subList(count * 5, (count * 5) + 5));
			case "lateralAcceleration":
				return new ArrayList<Double>(lateral_acceleration.subList(count * 5, (count * 5) + 5));
			case "passengerCount":
				return new ArrayList<Double>(passenger_count.subList(count * 5, (count * 5) + 5));
			case "carLoad":
				return new ArrayList<Double>(cars_load.subList(count * 5, (count * 5) + 5));
			case "airConditionStatus":
				return new ArrayList<Double>(air_condition_status.subList(count * 5, (count * 5) + 5));
			case "windowOpening":
			case "radioVolume":
				return new ArrayList<Double>(radio_volume.subList(count * 5, (count * 5) + 5));
			case "rainIntensity":
				return new ArrayList<Double>(rain_intensity.subList(count * 5, (count * 5) + 5));
			case "visibility":
				return new ArrayList<Double>(visibility.subList(count * 5, (count * 5) + 5));
			case "DriverWellBeing":
				return new ArrayList<Double>(drivers_wellbeing.subList(count * 5, (count * 5) + 5));
			default:
				return new ArrayList<Double>(driver_rush.subList(count * 5, (count * 5) + 5));
		}
	}
}

