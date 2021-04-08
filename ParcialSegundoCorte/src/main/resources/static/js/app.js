const app = (() => {

    var map;

    const initMap = () => {
        map = new google.maps.Map(document.getElementById('map'), {
            center: { lat: -34.397, lng: 150.644 },
            zoom: 4
        });
    }

    const getData = () => {
        var city = $('#input').val();
        apiclient.getDataByCity(city, (resp, error) => {
            if (error != null) {
                alert('problems to load data form API');
                return;
            }
            addToCard(resp);
        })
    }

    const addToCard = data => {
        $('#data').empty();
        console.log('Entreee')
        $('#data').append(
            `
            <p>Name: ${data.name}</p>
            <p>Clouds: ${data.cloud.all}</p>
            <div>
                <p><b>Coordenadas</b><p/>
                <p>Lon: ${data.coord.lon}</p>
                <p>Lat: ${data.coord.lat}</p>
            </div>
            <p>Pais: ${data.sys.country}</p>
            <div>
                <p><b>Clima</b><p/>
                <p>Principalmente: ${data.weather.main}</p>
                <p>Description: ${data.weather.description}</p>
            </div>
            <div>
                <p><b>Vientos</b><p/>
                <p>Velocidad: ${data.wind.speed}</p>
            </div>

            `
        );

        var marker = new google.maps.Marker({
            position: { lat: data.coord.lat, lng: data.coord.lon },
            map: map
        });

        map.setCenter(new google.maps.LatLng(data.coord.lat,data.coord.lon));

    }

    return {
        loadData: () => {
            initMap();
        },

        click: () => {
            getData();
        }
    }
})();