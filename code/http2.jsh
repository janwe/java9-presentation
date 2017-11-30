/env -add-modules jdk.incubator.httpclient
import jdk.incubator.http.*;

HttpClient.newHttpClient().sendAsync(
        HttpRequest.newBuilder(URI.create("https://www.google.no"))
                .GET()
                .build(),
        HttpResponse.BodyHandler.asString()
        ).thenAccept(response -> System.out.println(response.statusCode()));