package com.xworkz.resources.runner;

import com.xworkz.resources.creator.Resources;

public class ResourcesRunner {

    public static void main(String[] args) {

        try(Resources resources = new Resources()){

            resources.connect();
            resources.use();
            
        }
    }
}
