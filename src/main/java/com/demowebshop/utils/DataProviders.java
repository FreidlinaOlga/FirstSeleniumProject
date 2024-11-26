package com.demowebshop.utils;

import com.demowebshop.models.Contacts;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
@DataProvider
    public Iterator<Object[]> createNewAccount() {
    List<Object[]> list = new ArrayList<>();
    list.add(new Object[]{"Anna","Schulz", "an555@gmail.com", "posT567$"});
    list.add(new Object[]{"Anna1","Schulz", "an556@gmail.com", "posT567$"});
    list.add(new Object[]{"Anna2","Schulz", "an557@gmail.com", "posT567$"});

    return list.iterator();
}

@DataProvider
    public Iterator<Object[]> createNewAccountWithCsv() throws IOException {
    List<Object[]> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(new File
            ("src/test/resources/user.csv")));
    String line = reader.readLine();
    while (line != null) {
        String[] split = line.split(",");

        list.add(new Object[]{new Contacts()
                .setFirstName(split[0])
                .setLastName(split[1])
                .setEmail(split[2])
                .setPassword(split[3])});
        line = reader.readLine();

    }
    return list.iterator();

}
}
