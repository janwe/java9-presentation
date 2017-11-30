List<Optional<String>> optionals = List.of(
    Optional.of("Java"),
    Optional.of("nine"),
    Optional.empty(),
    Optional.of("Optional")
);

System.out.println("Optionals in list:")
optionals.stream().forEach(System.out::println)

System.out.println("\nAll Optional values (or null):")
optionals.stream().map(o -> o.orElse(null)).forEach(System.out::println)

System.out.println("\nOnly present Optional values:")
optionals.stream().flatMap(Optional::stream).forEach(System.out::println)