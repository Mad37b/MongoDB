package com.iesVda.testMongo;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.bson.*;
import static com.mongodb.client.model.Filters.*;
import java.util.*;
import com.mongodb.*;
import com.mongodb.client.*;

public class FilmDao implements DaoInterface<movies> {

	MongoClient conexion;
	
	MongoDatabase database;
	
	MongoCollection<movies> collection;
	
	CodecRegistry pojoCodecRegistry;
	
	public ObjectId id;

	FilmDao(String string) {

		// Establecer Conexion 
		
		
		conexion = this.getConnection();
		database = conexion.getDatabase("sample_mflix").withCodecRegistry(pojoCodecRegistry);
		collection = database.getCollection("movies",movies.class)
	;}


	private MongoClient getConnection() {
		String url = "mongodb+srv://Mad37b:Pascal@mad37b.vqsepsr.mongodb.net/?retryWrites=true&w=majority";
		pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
		fromProviders(PojoCodecProvider.builder().automatic(true).build());
		MongoClient mongoClntObj = MongoClients.create(url);
		return mongoClntObj;
	}

	private void fromProviders(PojoCodecProvider pojoCodecProvider) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public movies get(movies t) {
		movies AuxiliarFilm = new movies();
		String FilmName = t.getTitle();
		collection = database.getCollection("movies");
		Bson equalComp = eq("title", FilmName);
		Document doc = collection.find(equalComp).first();
		// AuxiliarFilm=PopulateObject(doc);
		return AuxiliarFilm;
	}

	public movies get(String Title) {
		movies AuxiliarFilm = new movies();
		collection = database.getCollection("movies");
		Bson equalComp = eq("title", Title);
		Document doc = collection.find(equalComp).first();
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
		// TODO Auto-generated method stub
		return null;
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
