package com.emagister.formacion;

public class Food {

    private String name;
    private String description;
    private int imageResourceId;

    public static final Food[] FOODs = {
            new Food("Tacos al pastor", "Carne de cerdo, cebolla morada, cilantro con un toque de lima", R.drawable.tacos),
            new Food("Burrito de cochinita pibil", "Carne de cerdo, lechuga, cebolla morada, maíz, guacamole y salsa chipotle", R.drawable.burritos),
            new Food("Nachos", "Crema agria, maíz, guacamole y salsa medium", R.drawable.nachos)
    };

    public Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
