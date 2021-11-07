package com.hakaton.ovcarbanja;

import com.hakaton.ovcarbanja.model.Activity;
import com.hakaton.ovcarbanja.repository.ActivityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class OvcarbanjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OvcarbanjaApplication.class, args);
	}


	CommandLineRunner run(ActivityRepository activityRepository) throws ParseException {
		return args -> {
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

			Activity activity = new Activity(null, "Hidroterapija", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/7 11:00:00"), format.parse("2021/11/7 13:00:00"),
					false, false, 40);

			activityRepository.save(activity);
			Activity activity1 = new Activity(null, "Spa", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/7 16:00:00"), format.parse("2021/11/7 18:00:00"),
					false, false, 40);

			activityRepository.save(activity1);
			Activity activity2 = new Activity(null, "Finsko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/7 19:00:00"), format.parse("2021/11/7 20:00:00"),
					false, false, 40);

			activityRepository.save(activity2);





			Activity activity3 = new Activity(null, "Setnja banjom", "Ovcar banja", null, null,
					format.parse("2021/11/8 11:00:00"), format.parse("2021/11/8 13:00:00"),
					false, false, 40);

			activityRepository.save(activity3);
			Activity activity4 = new Activity(null, "Poseta lekaru", "Klinicki centar Cacak", null, null,
					format.parse("2021/11/8 16:00:00"), format.parse("2021/11/8 18:00:00"),
					false, false, 40);

			activityRepository.save(activity4);
			Activity activity5 = new Activity(null, "Tursko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/8 19:00:00"), format.parse("2021/11/8 20:00:00"),
					false, false, 40);

			activityRepository.save(activity5);






			Activity activity6 = new Activity(null, "Hidroterapija", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/9 11:00:00"), format.parse("2021/11/9 13:00:00"),
					false, false, 40);

			activityRepository.save(activity6);
			Activity activity7 = new Activity(null, "Spa", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/9 16:00:00"), format.parse("2021/11/9 18:00:00"),
					false, false, 40);

			activityRepository.save(activity7);
			Activity activity8 = new Activity(null, "Finsko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/9 19:00:00"), format.parse("2021/11/9 20:00:00"),
					false, false, 40);

			activityRepository.save(activity8);





			Activity activity9 = new Activity(null, "Setnja banjom", "Ovcar banja", null, null,
					format.parse("2021/11/10 11:00:00"), format.parse("2021/11/10 13:00:00"),
					false, false, 40);

			activityRepository.save(activity9);
			Activity activity10 = new Activity(null, "Poseta lekaru", "Klinicki centar Cacak", null, null,
					format.parse("2021/11/10 16:00:00"), format.parse("2021/11/10 18:00:00"),
					false, false, 40);

			activityRepository.save(activity10);
			Activity activity11 = new Activity(null, "Tursko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/10 19:00:00"), format.parse("2021/11/10 20:00:00"),
					false, false, 40);

			activityRepository.save(activity11);


			Activity activity12 = new Activity(null, "Hidroterapija", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/11 11:00:00"), format.parse("2021/11/11 13:00:00"),
					false, false, 40);

			activityRepository.save(activity12);
			Activity activity13 = new Activity(null, "Spa", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/11 16:00:00"), format.parse("2021/11/11 18:00:00"),
					false, false, 40);

			activityRepository.save(activity13);
			Activity activity14 = new Activity(null, "Finsko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/11 19:00:00"), format.parse("2021/11/11 20:00:00"),
					false, false, 40);

			activityRepository.save(activity14);





			Activity activity15 = new Activity(null, "Setnja banjom", "Ovcar banja", null, null,
					format.parse("2021/11/12 11:00:00"), format.parse("2021/11/12 13:00:00"),
					false, false, 40);

			activityRepository.save(activity15);
			Activity activity16 = new Activity(null, "Poseta lekaru", "Klinicki centar Cacak", null, null,
					format.parse("2021/11/12 16:00:00"), format.parse("2021/11/12 18:00:00"),
					false, false, 40);

			activityRepository.save(activity16);
			Activity activity17 = new Activity(null, "Tursko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/12 19:00:00"), format.parse("2021/11/12 20:00:00"),
					false, false, 40);

			activityRepository.save(activity17);




			Activity activity18 = new Activity(null, "Hidroterapija", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/13 11:00:00"), format.parse("2021/11/13 13:00:00"),
					false, false, 40);

			activityRepository.save(activity18);
			Activity activity19 = new Activity(null, "Spa", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/13 16:00:00"), format.parse("2021/11/13 18:00:00"),
					false, false, 40);

			activityRepository.save(activity19);
			Activity activity20 = new Activity(null, "Finsko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/13 19:00:00"), format.parse("2021/11/13 20:00:00"),
					false, false, 40);

			activityRepository.save(activity20);





			Activity activity21 = new Activity(null, "Setnja banjom", "Ovcar banja", null, null,
					format.parse("2021/11/14 11:00:00"), format.parse("2021/11/14 13:00:00"),
					false, false, 40);

			activityRepository.save(activity21);
			Activity activity22 = new Activity(null, "Poseta lekaru", "Klinicki centar Cacak", null, null,
					format.parse("2021/11/14 16:00:00"), format.parse("2021/11/14 18:00:00"),
					false, false, 40);

			activityRepository.save(activity22);
			Activity activity23 = new Activity(null, "Tursko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/14 19:00:00"), format.parse("2021/11/14 20:00:00"),
					false, false, 40);

			activityRepository.save(activity23);



			Activity activity24 = new Activity(null, "Hidroterapija", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/15 11:00:00"), format.parse("2021/11/15 13:00:00"),
					false, false, 40);

			activityRepository.save(activity24);
			Activity activity25 = new Activity(null, "Spa", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/15 16:00:00"), format.parse("2021/11/15 18:00:00"),
					false, false, 40);

			activityRepository.save(activity25);
			Activity activity26 = new Activity(null, "Finsko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/15 19:00:00"), format.parse("2021/11/15 20:00:00"),
					false, false, 40);

			activityRepository.save(activity26);





			Activity activity27 = new Activity(null, "Setnja banjom", "Ovcar banja", null, null,
					format.parse("2021/11/16 11:00:00"), format.parse("2021/11/16 13:00:00"),
					false, false, 40);

			activityRepository.save(activity27);
			Activity activity28 = new Activity(null, "Poseta lekaru", "Klinicki centar Cacak", null, null,
					format.parse("2021/11/16 16:00:00"), format.parse("2021/11/16 18:00:00"),
					false, false, 40);

			activityRepository.save(activity28);
			Activity activity29 = new Activity(null, "Tursko kupatilo", "Wellness Centar Kablar", null, null,
					format.parse("2021/11/16 19:00:00"), format.parse("2021/11/16 20:00:00"),
					false, false, 40);

			activityRepository.save(activity29);








		};
	}

}

