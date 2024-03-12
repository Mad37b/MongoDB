package com.iesVda.testMongo;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.*;

import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.bson.*;
import static com.mongodb.client.model.Filters.*;
import java.util.*;
import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.model.ReturnDocument;

public class FilmDao implements DaoInterface<movies> {

	MongoClient conexion;
	
	MongoDatabase database;
	
	MongoCollection<movies> collection;
	
	CodecRegistry pojoCodecRegistry;
	
	//CodecRegistries fromProviders;
	
	
	public ObjectId id;

	public FilmDao() {

		// Establecer Conexion 
		
		
		conexion = this.getConnection();
		database = conexion.getDatabase("sample_mflix").withCodecRegistry(pojoCodecRegistry);
		pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		collection = database.getCollection("movies",movies.class)
	;}


	private MongoClient getConnection() {
		String url = "mongodb+srv://Mad37b:Pascal@mad37b.vqsepsr.mongodb.net/?retryWrites=true&w=majority";
		CodecRegistry  pojoCodecRegistry  = fromProviders(PojoCodecProvider.builder().automatic(true).build());
		MongoClient mongoClntObj = MongoClients.create(url);
		return mongoClntObj;
	}




	public movies get(movies t) {
	return t;	
	}

	public movies getmoviebyTitle(String Title) {
		movies AuxiliarFilm = new movies();
	
		Bson equalComp = eq("title", Title);
		AuxiliarFilm= collection.find(equalComp).first();
		// AuxiliarFilm=PopulateObject(doc);
		return AuxiliarFilm;
	}

	@Override
	public List<movies> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public movies save(movies t) {
		movies newmovies = new movies ();
		collection.insertOne(newmovies);
		
		return t;
	}
	
	

	@Override
	public movies update(movies t, String[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(movies t) {
		// TODO Auto-generated method stub

	}

	// -------------------------------------------------

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

}
