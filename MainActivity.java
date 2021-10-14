package com.example.milestone6attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button btn_personal, btn_business, btn_search;

    ListView lv_listview;
    AddressBookAdapaterAndroid adapter;
   // AddressBook theList;

    AddressBook theList = new AddressBook();

  //  MyApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        
        btn_personal = findViewById(R.id.btn_personal);
        btn_business = findViewById(R.id.btn_business);
        btn_search = findViewById(R.id.btn_search);
        lv_listview = findViewById(R.id.lv_listview);


        PersonContact p1 = new PersonContact("Will Smith", "NewYork", "NewYork", "23999", "United States",
                "123-123-4444", "Stefanos@gmail.com", "Willie");

        PersonContact p2 = new PersonContact("Stefanos", "Fresno", "Ca", "93111", "UnitedStates", "559-999-3123",
                "Email@dress", "Greek Boi");

        PersonContact p3 = new PersonContact("John", "Phoenix", "AZ", "12313", "United States", "233-131-1312",
                "Email1232@adress", "Nerd");





        theList.addOne(p1);
        theList.addOne(p2);
        theList.addOne(p3);


        adapter = new AddressBookAdapaterAndroid(MainActivity.this, theList);

        lv_listview.setAdapter(adapter);


        btn_personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Add_Person_Contact.class);
                startActivity(i);
                Bundle incomingMessages = getIntent().getExtras();

                if (incomingMessages != null) {
                    String name = incomingMessages.getString("Name");
                    String city = incomingMessages.getString("city");
                    String state = incomingMessages.getString("state");
                    String postalCode = incomingMessages.getString("zipCode");
                    String phoneNumber = incomingMessages.getString("phoneNumber");
                    String email = incomingMessages.getString("email");
                    String country = incomingMessages.getString("country");
                    String nickname = incomingMessages.getString("nickname");

                    PersonContact p = new PersonContact(name, city, state, postalCode, country, phoneNumber,
                            email, nickname);

                    theList.addOne(p);


                    adapter.notifyDataSetChanged();


                }
            }
        });

        btn_business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Add_Business_Contact.class);
                startActivity(i);

                Bundle incomingMessages = getIntent().getExtras();
                if (incomingMessages != null) {
                    String name = incomingMessages.getString("Name");
                    String city = incomingMessages.getString("city");
                    String state = incomingMessages.getString("state");
                    String postalCode = incomingMessages.getString("zipCode");
                    String phoneNumber = incomingMessages.getString("phoneNumber");
                    String email = incomingMessages.getString("email");
                    String country = incomingMessages.getString("country");
                    String companyName = incomingMessages.getString("nickname");

                    BusinessContact p4 = new BusinessContact("Bob", "Jersey", "NY", "12313", "United States", "233-131-1312",
                            "Email1232@adress", "AT&T");


                    theList.addOne(p4);


                    adapter.notifyDataSetChanged();

                }
            }




        });

        lv_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                editPerson(position);
            }
        });
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SearchContacts.class);
            startActivity(i);
            }
        });

    }
    public void editPerson(int position){
        Intent i = new Intent(getApplicationContext(), Add_Person_Contact.class);
        // get the contents of person at position

        PersonContact p = (PersonContact) theList.theList.get(position);

        i.putExtra("name", p.getName());
        i.putExtra("city", p.getCity());
        i.putExtra("state", p.getState());
        i.putExtra("zipCode", p.getPostalCode());
        i.putExtra("phoneNumber",p.getPhoneNumber());
        i.putExtra("email", p.getEmail());
        i.putExtra("nickname", p.getNickName());
        i.putExtra("country", p.getCountry());
        startActivity(i);
    }
}





