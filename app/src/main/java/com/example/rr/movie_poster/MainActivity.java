package com.example.rr.movie_poster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_view = findViewById(R.id.list_v);

        int [] images = {R.drawable.donnie,
                R.drawable.fightclub,
                R.drawable.goodbad,
                R.drawable.november,
                R.drawable.red2,
                R.drawable.scarface};
        String [] movie_name = {
                "Donnie Brasco",
                "Fightclub",
                "The Good The bad & The Ugly",
                "The November Man",
                "RED 2",
                "Scarface"
        };
        String [] release_date = {
                "February 28, 1997",
                "September 21, 1999",
                "December 23, 1966",
                "August 27, 2014",
                "July 18, 2013",
                "December 1, 1983"
        };
        String [] total_income = {
                "$65 million",
                "$100.9 million",
                "$251 million",
                "$34.8 million",
                "$148.1 million",
                "$65.8 million"
        };
        String [] cast = {
                "Al Pacino, Johnny Depp, Michael Madsen, Bruno Kirby, Anne Heche",
                "Edward Norton, Brad Pitt, Meat Loaf, Zach Grenier, Richmond Arquette",
                "Eli Wallach, Clint Eastwood, Lee Van Cleef, Aldo Giuffrè, Luigi Pistilli",
                "Pierce Brosnan, Luke Bracey, Olga Kurylenko, Bill Smitrovich, Amila Terzimehic",
                "Bruce Willis, John Malkovich, Mary-Louise Parker, Helen Mirren, Anthony Hopkins",
                "Al Pacino, Steven Bauer, Michelle Pfeiffer, Robert Loggia, Miriam Colon"
        };
        String [] description = {
                "An FBI undercover agent infiltrates the mob and finds himself identifying more with the mafia life, at the expense of his regular one.",
                "An insomniac office worker, looking for a way to change his life, crosses paths with a devil-may-care soapmaker, forming an underground fight club that evolves into something much, much more.",
                "A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.",
                "An ex-C.I.A. operative is brought back in on a very personal mission and finds himself pitted against his former pupil in a deadly game involving high level C.I.A. officials and the Russian President-elect.",
                "Retired C.I.A. Agent Frank Moses reunites his unlikely team of elite operatives for a global quest to track down a missing portable nuclear device.",
                "$In Miami in 1980, a determined Cuban immigrant takes over a drug cartel and succumbs to greed."
        };

    Movie_list movie_list = new Movie_list(this,images, movie_name, release_date, total_income, cast, description);
        list_view.setAdapter(movie_list);
    }
}
