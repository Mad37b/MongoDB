package com.iesVda.testMongo;
import org.bson.Document;
import java.lang.reflect.*;
import java.lang.Class;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.*;
//import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
//import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
 

public class Util {
	// Method to make a connection to the mongodb server listening on a default port
    private MongoClient getConnection() {
        
        String url = "mongodb+srv://Mad37b:Pascal@mad37b.vqsepsr.mongodb.net/?retryWrites=true&w=majority";
 
        MongoClient mongoClntObj = MongoClients.create(url);
        return mongoClntObj;
    }

    public Document findFilm (String filmName) {
    	MongoClient conn =this.getConnection();
    	MongoDatabase database = conn.getDatabase("sample_mflix");
        MongoCollection<Document> collection = database.getCollection("movies");
        Bson equalComp=eq("title",filmName);
        Document doc = collection.find(equalComp).first();
        if (doc != null) {
            System.out.println(doc.toJson());
            
            
        } else {
        	
            System.out.println("No matching documents found.");
            
            
        }
        return doc;	
    }
    Field[] classFields;
    public Field[]studyAClass (Class <?> aClass){
    	
    	Field[] theFields = aClass.getDeclaredFields();
    	return theFields;
    	
    }
 
    // Method to search a user in the mongodb
   
}  

