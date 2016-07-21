package com.example.broadcastbestpractice;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

//活动管理类
public class ActivityCollector {

		public static List<Activity> activities = new ArrayList<Activity>();
		
		public static void addActivity(Activity activity) {
			activities.add(activity);
		}
		
		public static void removeActivity(Activity activity) {
			activities.add(activity);
		}
		
		public static void finishAll() {
			for (Activity activity : activities) {
				if(!activity.isFinishing()) {
					activity.finish();
				}
			}
		}
}
