package com.company;

import Task_01_Student.FirstTaskExecutor;
import Task_02_Customer.SecondTaskExecutor;
import Task_03_Patient.ThirdTaskExecutor;
import Task_04_Enroller.FourthTaskExecutor;
import Task_05_Book.FifthTaskExecutor;
import Task_06_House.SixthTaskExecutor;
import Task_07_Phone.SeventhTaskExecutor;
import Task_08_Car.EigthTaskExecutor;
import Task_09_Product.NinthTaskExecutor;
import Task_10_Train.TenthTaskExecutor;
import Task_11_Bus.EleventhTaskExecutor;
import Task_12_Airlines.TwelfthTaskExecutor;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        FirstTaskExecutor.start();
        SecondTaskExecutor.start();
        ThirdTaskExecutor.start();
        FourthTaskExecutor.start();
        FifthTaskExecutor.start();
        SixthTaskExecutor.start();
        SeventhTaskExecutor.start();
        EigthTaskExecutor.start();
        NinthTaskExecutor.start();
        TenthTaskExecutor.start();
        EleventhTaskExecutor.start();
        TwelfthTaskExecutor.start();

        LocalDate d= LocalDate.of( 1 , 2 , 11 );

        System.out.println(d);
    }
}