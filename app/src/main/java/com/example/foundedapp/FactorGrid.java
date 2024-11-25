package com.example.foundedapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FactorGrid extends AppCompatActivity {

     List<Book> lstBook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor_grid);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Martin Eberhard",
                "Tesla",

                "Tesla, Inc. (antigamente Tesla Motors, Inc.) é uma empresa automotiva e de armazenamento de energia norte americana que desenvolve," +
                        " produz e vende automóveis elétricos de alto desempenho, componentes para motores e transmissões " +
                        "para veículos elétricos e produtos à base de baterias." +
                        "Foi fundada em 2003 pelos engenheiros Martin Eberhard e Marc Tarpenning em San Carlos, " +
                        "Califórnia. O seu nome é uma homenagem ao inventor e engenheiro eletricista Nikola Tesla.",

                R.drawable.tesla));

        lstBook.add(new Book("Mark Zuckerberg",
                "Facebook",

                "Meta Platforms, Inc. (formerly Facebook, Inc). " +
                        "is an American technology and social media conglomerate headquartered in Menlo Park, " +
                        "California. It was founded by Mark Zuckerberg, along with his roommates and Harvard students, " +
                        "who were Eduardo Saverin, Andrew McCollum, Dustin Moskovitz and Chris Hughes, originally as TheFacebook.com - " +
                        "now Facebook, a popular global social networking site and Google.",

                R.drawable.facebook));

        lstBook.add(new Book("Harland Sanders",
                "KFC",

                "KFC Corporation, doing business as KFC (also commonly referred to by its historical name Kentucky Fried Chicken), " +
                        "is an American fast food restaurant chain that specializes in fried chicken. " +
                        "Headquartered in Louisville, Kentucky, it is the world's second-largest restaurant chain " +
                        "(as measured by sales) after McDonald's, with over 30,000 locations globally in 150 countries as of April 2024." +
                        "The chain is a subsidiary of Yum! Brands, a restaurant company that also owns the Pizza Hut and Taco Bell chains.",
                R.drawable.kfc));

        lstBook.add(new Book("Zhang Yiming",
                "Tiktok",

                "TikTok, whose mainland Chinese and Hong Kong counterpart is Douyin," +
                        " is a short-form video hosting service owned by Chinese internet company ByteDance. " +
                        "It hosts user-submitted videos, which can range in duration from three seconds to 60 minutes. " +
                        "It can be accessed with a smart phone app or the web.",
                R.drawable.tiktok));

        lstBook.add(new Book("Jeff Bezos",
                "Amazon",

                "Amazon.com, Inc., doing business as Amazon (/ˈæməzɒn/, AM-ə-zon; UK also /ˈæməzən/, AM-ə-zən), " +
                        "is an American multinational technology company engaged in electronic commerce, " +
                        "computer cloud, online advertising, digital streaming, and artificial intelligence. " +
                        "Founded in 1994 by Jeff Bezos in Bellevue, Washington, the company originally began as an online marketplace for books, " +
                        "but gradually expanded its offerings to include a wider range of product categories, " +
                        "referred to as \"The Everything Store.\" Today, Amazon is considered one of the Big Five American technology companies, " +
                        "the other four being Alphabet, Apple, Meta, and Microsoft.",
                R.drawable.amazon));

        lstBook.add(new Book("Steve Jobs",
                "Apple",

                "Apple Inc. is an American multinational corporation and technology " +
                        "company headquartered and incorporated in Cupertino, California, in Silicon Valley. " +
                        "It is best known for its consumer electronics, software, and services. " +
                        "Founded in 1976 as Apple Computer Company by Steve Jobs, Steve Wozniak and " +
                        "Ronald Wayne, the company was incorporated by Jobs and Wozniak as Apple Computer, " +
                        "Inc. the following year. It was renamed Apple Inc. in 2007 as the company " +
                        "had expanded its focus from computers to consumer electronics. Apple is the largest technology company by revenue, " +
                        "with $391.04 billion in 2024.",
                R.drawable.apple));

        lstBook.add(new Book("Larry Page",
                "Google",

                "Google LLC (/ˈɡuːɡəl/ ⓘ GOO-gəl) is an American-based multinational corporation and technology company " +
                        "focusing on online advertising, search engine technology, cloud computing, " +
                        "computer software, quantum computing, e-commerce, consumer electronics, " +
                        "and artificial intelligence (AI). It has been referred to as \"the most powerful company in the world\" " +
                        "and is one of the world's most valuable brands due to its market dominance, data collection, " +
                        "and technological advantages in the field of AI. " +
                        "Google's parent company, Alphabet Inc., is one of the five Big Tech companies, alongside Amazon, Apple, Meta, and Microsoft.",
                R.drawable.google));

        lstBook.add(new Book("Pavel Durov",
                "Telegram",

                "Telegram Messenger, commonly known as Telegram, is a cloud-based, cross-platform, " +
                        "social media and instant messaging (IM) service. " +
                        "It was originally launched for iOS on 14 August 2013 and Android on 20 October 2013. " +
                        "It allows users to exchange messages, share media and files, " +
                        "and hold private and group voice or video calls as well as public livestreams. " +
                        "It is available for Android, iOS, Windows, macOS, Linux, and web browsers. " +
                        "Telegram offers end-to-end encryption in voice and video calls, and in optional private chats, which Telegram calls Secret Chats.",
                R.drawable.telegram));

        lstBook.add(new Book("Mohammed bin Salman",
                "Saudi Aramco",

                "Saudi Aramco (Arabic: ارامكو السعودية\u200E), officially the Saudi Arabian Oil Company, " +
                        "formerly known as Aramco (Arabian-American Oil Company) is the state-owned oil company headquartered in Dahran," +
                        " Saudi Arabia, and is the largest oil company in the world in terms of crude oil and production reserves. " +
                        "The value of Saudi Aramco has been estimated at up to $2 trillion dollars in the Financial Times.",
                R.drawable.petroleo));

        lstBook.add(new Book("John Stith Pemberton",
                "Coca cola",

                "The Coca-Cola Company is an American multinational company founded in 1892 and known " +
                        "for producing the soft drink Coca-Cola. The beverage industry company also manufactures," +
                        " sells and markets other non-alcoholic and alcoholic beverage concentrates and syrups." +
                        " The company's shares are listed on the NYSE and are part of the DJIA and the " +
                        "S&P 500 and S&P 100 indices.",
                R.drawable.coca));

        lstBook.add(new Book("Lee Byung-chul",
                "Samsung Electronics",

                "Samsung Electronics Co., Ltd. (hangul: 삼성전자; hanja: 三星電子; rr: Samseong Jeonja lit: Tristar Electronics, sometimes abbreviated to SEC and stylized as SΛMSUNG)" +
                        " is a South Korean multinational electronics company headquartered in Yeongtong-gu, " +
                        "Suwon in South Korea South. It is the pinnacle of Samsung's chaebol, accounting for 70% of the group's revenue in 2012." +
                        " Samsung Electronics played a key role in the group's corporate governance due to circular ownership. " +
                        "Samsung Electronics has assembly plants and sales networks in 74 countries and employs about 290,000 people. " +
                        "It is majority owned by foreign investors.",
                R.drawable.samsung));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
