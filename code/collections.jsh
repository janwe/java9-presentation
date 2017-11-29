Set<String> mySet = Set.of("Java", "nine", "collections");

List<String> myList = List.of("Java", "nine", "collections");

Map<String,String> myMap = Map.of("Duke", "Java", "coolest", "nine", "better", "collections");

Map<String,String> myEntryMap = Map.ofEntries(
    Map.entry("Duke", "Java"),
    Map.entry("coolest", "nine"),
    Map.entry("better", "collections")
);