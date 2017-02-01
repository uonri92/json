
package lam17.example.com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private List<Contact> contacts = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
