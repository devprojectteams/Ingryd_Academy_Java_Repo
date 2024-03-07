package org.example.week2;

public class StringURLSplitter {
    public static void main(String[] args) {

        // Initialize the original string
        String originalString = "http://ingrydacademy.com/students";

        // Split the string into parts using the substring() method
        String protocol = originalString.substring(0, originalString.indexOf("/"));
        String host = originalString.substring(originalString.indexOf("//") + 2, originalString.indexOf("/", 7));
        String endpoint = originalString.substring(originalString.indexOf("/", 7));

        // Print the protocol, host, and endpoint
        System.out.println("Protocol: " + protocol);
        System.out.println("Host: " + host);
        System.out.println("Endpoint: " + endpoint);
    }
}
