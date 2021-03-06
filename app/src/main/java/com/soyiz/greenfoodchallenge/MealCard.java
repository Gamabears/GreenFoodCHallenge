package com.soyiz.greenfoodchallenge;

import java.util.HashMap;
import java.util.Map;

public class MealCard {

    private String uuid = null;
    private String creator = null;
    private String mealName = null;
    private String mealProtein = null;
    private String restaurantName = null;
    private String restaurantLocation = null;
    private String mealDescription = null;

    MealCard() {

    }

    // Constructor from data map
    MealCard(Map<String, Object> map) {
        this.uuid = (String) map.get(FirebaseHelper.Firestore.UUID_TAG);
        this.creator = (String) map.get(FirebaseHelper.Functions.CREATOR);

        this.mealName = (String) map.get(FirebaseHelper.Firestore.MEAL_NAME);
        this.mealProtein = (String) map.get(FirebaseHelper.Firestore.MEAL_PROTEIN);
        this.mealDescription = (String) map.get(FirebaseHelper.Firestore.MEAL_DESCRIPTION);

        this.restaurantName = (String) map.get(FirebaseHelper.Firestore.RESTAURANT_NAME);
        this.restaurantLocation = (String) map.get(FirebaseHelper.Firestore.RESTAURANT_LOCATION);
    }

    public Map<String, Object> exportToStringMap() {
        Map<String, Object> map = new HashMap<>();

        map.put(FirebaseHelper.Firestore.UUID_TAG, uuid);
        map.put(FirebaseHelper.Functions.CREATOR, creator);

        map.put(FirebaseHelper.Firestore.MEAL_NAME, mealName);
        map.put(FirebaseHelper.Firestore.MEAL_PROTEIN, mealProtein);
        map.put(FirebaseHelper.Firestore.MEAL_DESCRIPTION, mealDescription);

        map.put(FirebaseHelper.Firestore.RESTAURANT_NAME, restaurantName);
        map.put(FirebaseHelper.Firestore.RESTAURANT_LOCATION, restaurantLocation);

        return map;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealProtein() {
        return mealProtein;
    }

    public void setMealProtein(String mealProtein) {
        this.mealProtein = mealProtein;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
