package observerpattern;

import java.util.HashMap;

interface Observer {
    public void update(HashMap<String,Integer> carBrands);
}