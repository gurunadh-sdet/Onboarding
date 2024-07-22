package epam.corejava.java8.predicates;

import java.util.List;
import java.util.function.Predicate;

import epam.corejava.java8.beans.Response;

public class ResponseExamples {

	public static void main(String[] args) {
		
		//Adding few sample responses
		List<Response> responses = List.of(
                new Response("Error: Bad Request1", 400, "JSON"),
                new Response("Success: OK", 200, "XML"),
                new Response("Error: Bad Request2", 400, "JSON"),
                new Response("Error: Internal Server Error", 500, "XML"),
                new Response("Error: Bad Request3", 400, "XML"),
                new Response("Error: Bad Gateway", 502, "JSON")
        );
		
	//6. Define a predicate to check if the status code is 400.
		
		Predicate<Response> isCode400 = new Predicate<Response>() {
			
			public boolean test(Response t) {
				return t.getStatusCode()==400;
			}	
		};
		
		System.out.println("6.  Print all the responses with status code 400 from the given list of responses.");
		for(Response r:responses) {
			if(isCode400.test(r))
				System.out.println(r);
		}
			
		
	// 7. Define a predicate to check if the response type JSON.
		Predicate<Response> isResponseTypeJSON = new Predicate<Response>() {
					
					public boolean test(Response t) {
						return t.getResponseType().equalsIgnoreCase("JSON");
					}	
		};
		
		System.out.println("7.Print all the responses the response type JSON from the given list of responses.");
		for(Response r:responses) {
			if(isResponseTypeJSON.test(r))
				System.out.println(r);
		}
		
	// 8. Print all the responses with status code 400 and response type JSON	
		System.out.println("8. Print all the responses with status code 400 and response type JSON");
		for(Response r:responses) {
			if(isCode400.and(isResponseTypeJSON).test(r))
				System.out.println(r);
		}
		
	//9. Print all the responses with status code 400 or response type JSON	
		System.out.println("9. Print all the responses with status code 400 or response type JSON");
		for(Response r:responses) {
			if(isCode400.or(isResponseTypeJSON).test(r))
				System.out.println(r);
		}
		
	//10. Print all the responses with status code is not 400 and response type JSON
		System.out.println("10. Print all the responses with status code is not 400 and response type JSON");
		for(Response r:responses) {
			if(isCode400.negate().and(isResponseTypeJSON).test(r))
				System.out.println(r);
		}
		
	}

}
