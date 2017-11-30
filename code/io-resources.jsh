void copyFile(InputStream in, OutputStream out) throws IOException {
    try (in; out) {
        in.transferTo(out);
    }
}

InputStream inFile = Files.newInputStream(Paths.get("in.txt"));
OutputStream outFile = Files.newOutputStream(Paths.get("out.txt"));

copyFile(inFile, outFile);

try (InputStream inFileAgain = Files.newInputStream(Paths.get("in.txt"));) {
    byte[] allBytes = inFileAgain.readAllBytes();
}