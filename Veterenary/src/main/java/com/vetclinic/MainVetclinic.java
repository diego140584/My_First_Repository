package com.vetclinic;

import java.io.IOException;

/**
 * Created by Stas on 29.03.2016.
 */
public class MainVetclinic {
    public static void main(String[] args) throws IOException {
      Clinic clinic = new Clinic();
        clinic.addVisitors();
        clinic.getVisitors();

    }
}
