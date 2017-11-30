//Expected 0,1,2,3,4
IntStream.of(0,1,2,3,4,5,6,7,8,9).takeWhile(i -> i < 5).forEach(System.out::println)

System.out.println()

//Expected 5,6,7,8,9
IntStream.of(0,1,2,3,4,5,6,7,8,9).dropWhile(i -> i < 5).forEach(System.out::println)