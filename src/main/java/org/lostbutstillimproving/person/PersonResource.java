package org.lostbutstillimproving.person;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;


@Path("index")
@Produces(MediaType.TEXT_HTML)
public class PersonResource {

    @Inject
    PersonStore personStore;
    @CheckedTemplate
    public static class Templates {

        private Templates() {
        }

        public static native TemplateInstance index(Person person);
    }


    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        Person person = personStore.getRandomPerson();
        return Templates.index(person);
    }
}
