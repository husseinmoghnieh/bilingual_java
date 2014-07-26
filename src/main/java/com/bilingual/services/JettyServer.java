package com.bilingual.services;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by huss on 2014-06-22.
 */
public class JettyServer {
    public static void main(String[] args)
    {
        Server server = new Server(8000);
        try {

            String workingDir = System.getProperty("user.dir");
            String papers_backend = "/target/beling.backend";


//
//            WebAppContext uiApp = new WebAppContext();
//            uiApp.setContextPath("/papers_ui");
//            uiApp.setExtractWAR(true);
//            uiApp.setWar(workingDir + paper_ui_explodedWar);


            WebAppContext webbackendApp = new WebAppContext();
            webbackendApp.setContextPath("/biling_backend");
            webbackendApp.setExtractWAR(true);
            webbackendApp.setWar(workingDir + papers_backend);





            HandlerCollection handlerCollection = new HandlerCollection();
            handlerCollection.setHandlers(new Handler[] { webbackendApp});


            server.setHandler(handlerCollection);

            server.start();
            server.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
