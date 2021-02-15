package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;

import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;

import static org.junit.Assert.*;


public class JobTest {

    Job testJob1 = new Job();
    Job testJob2 = new Job();
    Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
            "Quality control"), new CoreCompetency("Persistence"));
    Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
            "Quality control"), new CoreCompetency("Persistence"));


    //Test ID values for two objects are not the same.
    @Test
    public void testSettingJobId(){
        assertEquals(1, testJob2.getId() - testJob1.getId());
    }

    //Test the full constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(testJob3.getName() instanceof String);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
    }

    //Test the equals method
    @Test
    public void testJobsForEquality(){
        assertFalse(testJob3.equals(testJob4));
    }

    @Test
    public void testToString(){
        assertNotEquals(testJob3.toString(),
                "\nName: " + testJob3.getName() +
                "\nEmployer: " + testJob3.getEmployer() +
                "\nLocation: " + testJob3.getLocation() +
                "\nPosition Type: " + testJob3.getPositionType() +
                "\nCore Competency: " + testJob3.getCoreCompetency() +
                "\n"
        );
    }

}
