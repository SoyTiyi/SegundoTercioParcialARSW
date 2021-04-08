package co.edu.eci.arsw.ParcialSegundoCorte.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.eci.arsw.ParcialSegundoCorte.Service.IWeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    IWeatherService ws;

    @RequestMapping(value = "/{city}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherByCity(@PathVariable(name = "city") String city) {
        try {
            return new ResponseEntity<>(ws.getWeatherByCity(city), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.FORBIDDEN);
        }
    }
}
