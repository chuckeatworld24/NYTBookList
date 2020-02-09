package com.example.andrew.nytapi;

import com.example.andrew.nytapi.Models.CategoriesWrapper;
import com.example.andrew.nytapi.Models.Category;
import com.google.gson.Gson;

import java.util.List;

public class MockCategoriesRepository implements CategoriesRepository {


    @Override
    public void getCategories(RepositoryCallbacks callbacks) {
        Gson gson = new Gson();

        CategoriesWrapper categoriesWrapper = gson.fromJson(json, CategoriesWrapper.class);

        callbacks.onSuccess(categoriesWrapper.getBody().getCategories());
    }


    private final String json = "{\n" +
            "    \"headers\": {\n" +
            "        \"status\": \"OK\",\n" +
            "        \"copyright\": \"Copyright (c) 2018 The New York Times Company.  All Rights Reserved.\",\n" +
            "        \"num_results\": 55\n" +
            "    },\n" +
            "    \"body\": {\n" +
            "        \"results\": [\n" +
            "            {\n" +
            "                \"list_name\": \"Combined Print and E-Book Fiction\",\n" +
            "                \"display_name\": \"Combined Print & E-Book Fiction\",\n" +
            "                \"list_name_encoded\": \"combined-print-and-e-book-fiction\",\n" +
            "                \"oldest_published_date\": \"2011-02-13\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Combined Print and E-Book Nonfiction\",\n" +
            "                \"display_name\": \"Combined Print & E-Book Nonfiction\",\n" +
            "                \"list_name_encoded\": \"combined-print-and-e-book-nonfiction\",\n" +
            "                \"oldest_published_date\": \"2011-02-13\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Hardcover Fiction\",\n" +
            "                \"display_name\": \"Hardcover Fiction\",\n" +
            "                \"list_name_encoded\": \"hardcover-fiction\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Hardcover Nonfiction\",\n" +
            "                \"display_name\": \"Hardcover Nonfiction\",\n" +
            "                \"list_name_encoded\": \"hardcover-nonfiction\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Trade Fiction Paperback\",\n" +
            "                \"display_name\": \"Paperback Trade Fiction\",\n" +
            "                \"list_name_encoded\": \"trade-fiction-paperback\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Mass Market Paperback\",\n" +
            "                \"display_name\": \"Paperback Mass-Market Fiction\",\n" +
            "                \"list_name_encoded\": \"mass-market-paperback\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Paperback Nonfiction\",\n" +
            "                \"display_name\": \"Paperback Nonfiction\",\n" +
            "                \"list_name_encoded\": \"paperback-nonfiction\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"E-Book Fiction\",\n" +
            "                \"display_name\": \"E-Book Fiction\",\n" +
            "                \"list_name_encoded\": \"e-book-fiction\",\n" +
            "                \"oldest_published_date\": \"2011-02-13\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"E-Book Nonfiction\",\n" +
            "                \"display_name\": \"E-Book Nonfiction\",\n" +
            "                \"list_name_encoded\": \"e-book-nonfiction\",\n" +
            "                \"oldest_published_date\": \"2011-02-13\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Hardcover Advice\",\n" +
            "                \"display_name\": \"Hardcover Advice & Misc.\",\n" +
            "                \"list_name_encoded\": \"hardcover-advice\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2013-04-21\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Paperback Advice\",\n" +
            "                \"display_name\": \"Paperback Advice & Misc.\",\n" +
            "                \"list_name_encoded\": \"paperback-advice\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2013-04-21\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Advice How-To and Miscellaneous\",\n" +
            "                \"display_name\": \"Advice, How-To & Miscellaneous\",\n" +
            "                \"list_name_encoded\": \"advice-how-to-and-miscellaneous\",\n" +
            "                \"oldest_published_date\": \"2013-04-28\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Chapter Books\",\n" +
            "                \"display_name\": \"Children’s Chapter Books\",\n" +
            "                \"list_name_encoded\": \"chapter-books\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2012-12-09\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Childrens Middle Grade\",\n" +
            "                \"display_name\": \"Children’s Middle Grade\",\n" +
            "                \"list_name_encoded\": \"childrens-middle-grade\",\n" +
            "                \"oldest_published_date\": \"2012-12-16\",\n" +
            "                \"newest_published_date\": \"2015-08-23\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Childrens Middle Grade E-Book\",\n" +
            "                \"display_name\": \"Children’s Middle Grade E-Book\",\n" +
            "                \"list_name_encoded\": \"childrens-middle-grade-e-book\",\n" +
            "                \"oldest_published_date\": \"2015-08-30\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Childrens Middle Grade Hardcover\",\n" +
            "                \"display_name\": \"Children’s Middle Grade Hardcover\",\n" +
            "                \"list_name_encoded\": \"childrens-middle-grade-hardcover\",\n" +
            "                \"oldest_published_date\": \"2015-08-30\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Childrens Middle Grade Paperback\",\n" +
            "                \"display_name\": \"Children’s Middle Grade Paperback\",\n" +
            "                \"list_name_encoded\": \"childrens-middle-grade-paperback\",\n" +
            "                \"oldest_published_date\": \"2015-08-30\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Paperback Books\",\n" +
            "                \"display_name\": \"Children’s Paperback Books\",\n" +
            "                \"list_name_encoded\": \"paperback-books\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2012-12-09\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Picture Books\",\n" +
            "                \"display_name\": \"Children’s Picture Books\",\n" +
            "                \"list_name_encoded\": \"picture-books\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Series Books\",\n" +
            "                \"display_name\": \"Children’s Series\",\n" +
            "                \"list_name_encoded\": \"series-books\",\n" +
            "                \"oldest_published_date\": \"2008-06-08\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Young Adult\",\n" +
            "                \"display_name\": \"Young Adult\",\n" +
            "                \"list_name_encoded\": \"young-adult\",\n" +
            "                \"oldest_published_date\": \"2012-12-16\",\n" +
            "                \"newest_published_date\": \"2015-08-23\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Young Adult E-Book\",\n" +
            "                \"display_name\": \"Young Adult E-Book\",\n" +
            "                \"list_name_encoded\": \"young-adult-e-book\",\n" +
            "                \"oldest_published_date\": \"2015-08-30\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Young Adult Hardcover\",\n" +
            "                \"display_name\": \"Young Adult Hardcover\",\n" +
            "                \"list_name_encoded\": \"young-adult-hardcover\",\n" +
            "                \"oldest_published_date\": \"2015-08-30\",\n" +
            "                \"newest_published_date\": \"2018-11-25\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Young Adult Paperback\",\n" +
            "                \"display_name\": \"Young Adult Paperback\",\n" +
            "                \"list_name_encoded\": \"young-adult-paperback\",\n" +
            "                \"oldest_published_date\": \"2015-08-30\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Hardcover Graphic Books\",\n" +
            "                \"display_name\": \"Hardcover Graphic Books\",\n" +
            "                \"list_name_encoded\": \"hardcover-graphic-books\",\n" +
            "                \"oldest_published_date\": \"2009-03-15\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Paperback Graphic Books\",\n" +
            "                \"display_name\": \"Paperback Graphic Books\",\n" +
            "                \"list_name_encoded\": \"paperback-graphic-books\",\n" +
            "                \"oldest_published_date\": \"2009-03-15\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Manga\",\n" +
            "                \"display_name\": \"Manga\",\n" +
            "                \"list_name_encoded\": \"manga\",\n" +
            "                \"oldest_published_date\": \"2009-03-15\",\n" +
            "                \"newest_published_date\": \"2017-01-29\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Combined Print Fiction\",\n" +
            "                \"display_name\": \"Combined Hardcover & Paperback Fiction\",\n" +
            "                \"list_name_encoded\": \"combined-print-fiction\",\n" +
            "                \"oldest_published_date\": \"2011-02-13\",\n" +
            "                \"newest_published_date\": \"2013-05-12\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Combined Print Nonfiction\",\n" +
            "                \"display_name\": \"Combined Hardcover & Paperback Nonfiction\",\n" +
            "                \"list_name_encoded\": \"combined-print-nonfiction\",\n" +
            "                \"oldest_published_date\": \"2011-02-13\",\n" +
            "                \"newest_published_date\": \"2013-05-12\",\n" +
            "                \"updated\": \"WEEKLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Animals\",\n" +
            "                \"display_name\": \"Animals\",\n" +
            "                \"list_name_encoded\": \"animals\",\n" +
            "                \"oldest_published_date\": \"2014-09-07\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Audio Fiction\",\n" +
            "                \"display_name\": \"Audio Fiction\",\n" +
            "                \"list_name_encoded\": \"audio-fiction\",\n" +
            "                \"oldest_published_date\": \"2018-03-11\",\n" +
            "                \"newest_published_date\": \"2018-11-18\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Audio Nonfiction\",\n" +
            "                \"display_name\": \"Audio Nonfiction\",\n" +
            "                \"list_name_encoded\": \"audio-nonfiction\",\n" +
            "                \"oldest_published_date\": \"2018-03-11\",\n" +
            "                \"newest_published_date\": \"2018-11-18\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Business Books\",\n" +
            "                \"display_name\": \"Business\",\n" +
            "                \"list_name_encoded\": \"business-books\",\n" +
            "                \"oldest_published_date\": \"2013-11-03\",\n" +
            "                \"newest_published_date\": \"2018-11-18\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Celebrities\",\n" +
            "                \"display_name\": \"Celebrities\",\n" +
            "                \"list_name_encoded\": \"celebrities\",\n" +
            "                \"oldest_published_date\": \"2014-09-07\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Crime and Punishment\",\n" +
            "                \"display_name\": \"Crime and Punishment\",\n" +
            "                \"list_name_encoded\": \"crime-and-punishment\",\n" +
            "                \"oldest_published_date\": \"2014-10-12\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Culture\",\n" +
            "                \"display_name\": \"Culture\",\n" +
            "                \"list_name_encoded\": \"culture\",\n" +
            "                \"oldest_published_date\": \"2014-10-12\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Education\",\n" +
            "                \"display_name\": \"Education\",\n" +
            "                \"list_name_encoded\": \"education\",\n" +
            "                \"oldest_published_date\": \"2014-10-12\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Espionage\",\n" +
            "                \"display_name\": \"Espionage\",\n" +
            "                \"list_name_encoded\": \"espionage\",\n" +
            "                \"oldest_published_date\": \"2014-12-14\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Expeditions Disasters and Adventures\",\n" +
            "                \"display_name\": \"Expeditions\",\n" +
            "                \"list_name_encoded\": \"expeditions-disasters-and-adventures\",\n" +
            "                \"oldest_published_date\": \"2014-12-14\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Fashion Manners and Customs\",\n" +
            "                \"display_name\": \"Fashion, Manners and Customs\",\n" +
            "                \"list_name_encoded\": \"fashion-manners-and-customs\",\n" +
            "                \"oldest_published_date\": \"2014-10-12\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Food and Fitness\",\n" +
            "                \"display_name\": \"Food and Diet\",\n" +
            "                \"list_name_encoded\": \"food-and-fitness\",\n" +
            "                \"oldest_published_date\": \"2013-09-01\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Games and Activities\",\n" +
            "                \"display_name\": \"Games and Activities\",\n" +
            "                \"list_name_encoded\": \"games-and-activities\",\n" +
            "                \"oldest_published_date\": \"2014-10-12\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Hardcover Business Books\",\n" +
            "                \"display_name\": \"Hardcover Business Books\",\n" +
            "                \"list_name_encoded\": \"hardcover-business-books\",\n" +
            "                \"oldest_published_date\": \"2011-07-03\",\n" +
            "                \"newest_published_date\": \"2013-10-13\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Health\",\n" +
            "                \"display_name\": \"Health\",\n" +
            "                \"list_name_encoded\": \"health\",\n" +
            "                \"oldest_published_date\": \"2014-10-12\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Humor\",\n" +
            "                \"display_name\": \"Humor\",\n" +
            "                \"list_name_encoded\": \"humor\",\n" +
            "                \"oldest_published_date\": \"2014-09-07\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Indigenous Americans\",\n" +
            "                \"display_name\": \"Indigenous Americans\",\n" +
            "                \"list_name_encoded\": \"indigenous-americans\",\n" +
            "                \"oldest_published_date\": \"2014-12-14\",\n" +
            "                \"newest_published_date\": \"2016-01-10\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Relationships\",\n" +
            "                \"display_name\": \"Love and Relationships\",\n" +
            "                \"list_name_encoded\": \"relationships\",\n" +
            "                \"oldest_published_date\": \"2014-09-07\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Paperback Business Books\",\n" +
            "                \"display_name\": \"Paperback Business Books\",\n" +
            "                \"list_name_encoded\": \"paperback-business-books\",\n" +
            "                \"oldest_published_date\": \"2011-07-03\",\n" +
            "                \"newest_published_date\": \"2013-10-13\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Family\",\n" +
            "                \"display_name\": \"Parenthood and Family\",\n" +
            "                \"list_name_encoded\": \"family\",\n" +
            "                \"oldest_published_date\": \"2014-09-07\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Hardcover Political Books\",\n" +
            "                \"display_name\": \"Politics and American History\",\n" +
            "                \"list_name_encoded\": \"hardcover-political-books\",\n" +
            "                \"oldest_published_date\": \"2011-07-03\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Race and Civil Rights\",\n" +
            "                \"display_name\": \"Race and Civil Rights\",\n" +
            "                \"list_name_encoded\": \"race-and-civil-rights\",\n" +
            "                \"oldest_published_date\": \"2014-12-14\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Religion Spirituality and Faith\",\n" +
            "                \"display_name\": \"Religion, Spirituality and Faith\",\n" +
            "                \"list_name_encoded\": \"religion-spirituality-and-faith\",\n" +
            "                \"oldest_published_date\": \"2014-09-07\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Science\",\n" +
            "                \"display_name\": \"Science\",\n" +
            "                \"list_name_encoded\": \"science\",\n" +
            "                \"oldest_published_date\": \"2013-04-14\",\n" +
            "                \"newest_published_date\": \"2018-11-18\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Sports\",\n" +
            "                \"display_name\": \"Sports and Fitness\",\n" +
            "                \"list_name_encoded\": \"sports\",\n" +
            "                \"oldest_published_date\": \"2014-03-02\",\n" +
            "                \"newest_published_date\": \"2018-11-18\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"list_name\": \"Travel\",\n" +
            "                \"display_name\": \"Travel\",\n" +
            "                \"list_name_encoded\": \"travel\",\n" +
            "                \"oldest_published_date\": \"2014-09-07\",\n" +
            "                \"newest_published_date\": \"2017-01-15\",\n" +
            "                \"updated\": \"MONTHLY\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"num_results\": 55\n" +
            "    }\n" +
            "}";




}
