package org.xtext.example.mydsl;


import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.graphviz.dot.xtext.DotLanguageStandaloneSetupGenerated;
import graphviz.GraphvizPackage;
import graphviz.dot.impl.DotGraphImpl;

public class SerializerForGraph {

	public static void main(String[] args) {
		
		GraphvizPackage.eINSTANCE.eClass();
		
		Resource inputResource = loadFromXMI( "social.xmi" );
		DotGraphImpl model = (DotGraphImpl) inputResource.getContents().get(0);
		
		Injector injector = new DotLanguageStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();

		Serializer serializer = injector.getInstance( Serializer.class );  
		
		System.out.println( serializer.serialize( model ) );
	}
	
	static Resource loadFromXMI( String file ){
		Registry reg = Resource.Factory.Registry.INSTANCE;
    	Map<String,Object> m = reg.getExtensionToFactoryMap();
    	m.put("xmi", new XMIResourceFactoryImpl() );
		ResourceSet resSet = new ResourceSetImpl();
		return resSet.getResource( URI.createURI( file ), true );
	}

}
