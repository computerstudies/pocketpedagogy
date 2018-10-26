package com.infrontofthenet.pocketpedagogy.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 7;

    static {
        // Add some sample items.

        DummyItem di1 = createItem(1, "Scaffolding with Bloom", "\n\u2022 Evolving a single in-class project over an entire semester with each week\'s lesson progressing from the previous week\'s work." +
                "\n\n\u2022 Students' first major project becomes the starting point for their 2nd major project.  Phase 2 involves adding more advanced features and functionality." +
                "\n\n\u2022 Conducting weekly review quizzes to reinforce previous lesson concepts.");
        addItem(di1);

        DummyItem di2 = createItem(2, "Problem-Based Learning", "\n\u2022 Students participate in annual semester-long team based projects for external non-profit clients in a program capstone course." +
        "\n\n\u2022 Students synthesize all of the skills they've learned in a 2 year program to plan, design, build, test, and present a custom application solution for real-world implementation." +
        "\n\n\u2022 Team dynamics as well as project scope and timelines are often challenges.");
        addItem(di2);

        DummyItem di3 = createItem(3, "Social Constructivism", "Context is both social (culture, environment) and individual (the learner\'s own ideas, values, beliefs, history)." +
            "\n\nFor example, this semester my Introduction to Web Programming students chose to build a local restaurant review site in class. " +
            "Restaurants are familiar to all in a multicultural class and we have populated the list based on the students' cultural backgrounds, preferences and favourites.");
        addItem(di3);

        DummyItem di4 = createItem(4, "More Knowledgeable Other", "I see my role as a facilitator helping students learn" +
                " by: \n\n\u2022 Providing time to research and explore solutions during class exercises."+
                "\n\n\u2022 Live streaming lessons to YouTube to promote self-directed learning as a class supplement (not a substitute)." +
                "\n\n\u2022 Posting all in-class exercise solutions online for easy reference." +
                "\n\n\u2022 Offering bonus grades for independent learning on all assignments.");
        addItem(di4);

        DummyItem di5 = createItem(5, "Andragogy", "Motivation comes from the students.  They are adult learners who are paying to attend " +
                "and have selected both their school and program.  I promote student choice whenever possible: " +
                "\n\n\u2022 Students choose their own projects." +
                "\n\n\u2022 Students propose and vote on topics for in-class applications." +
                "\n\n\u2022 Students choose their own partners for group projects." +
                "\n\n\u2022 Textbooks are optional rather than required.");
        addItem(di5);

        DummyItem di6 = createItem(6, "Multiple Intelligences", "Different students learn best in different ways.  I try to provide material in a wide variety of ways:" +
        "\n\n\u2022 Hands-on activities" +
        "\n\n\u2022 Video" +
        "\n\n\u2022 Online Tutorials from 3rd parties" +
        "\n\n\u2022 Optional Textbooks" +
        "\n\n\u2022 Images and Infographics" +
        "\n\n\u2022 Group Work" +
        "\n\n\u2022 Online Research");
        addItem(di6);

        /*for (int i = 2; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }*/
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createItem(int position, String title, String content) {
        return new DummyItem(String.valueOf(position), title, content);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }



    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
