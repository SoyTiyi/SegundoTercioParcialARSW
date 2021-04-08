const app = (() => {

    var map;

    const initMap = () => {
        map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: -34.397, lng: 150.644},
            zoom: 1
        });
    }

    const getProvince = (country) => {
        apiclient.getAllDataByCountry(country, (data, error) => {
            if (error != null) {
                console.log(error);
                alert('Error to get the data from API');
                return;
            }
            apiclient.getCoordinateByCountry(country, (data, error) => {
                if (error != null) {
                    console.log(error);
                    alert('Error to get the data from API');
                    return;
                }
                console.log(data[0].latlng[0], 'lat', data[0].latlng[1], 'log');

                var marker = new google.maps.Marker({
                    position: {lat: data[0].latlng[0], lng: data[0].latlng[1]},
                    map: map
                });
            })
            $("#tbody").empty();
            const results = [];
            data.data.covid19Stats.map(province => {
                const newProvince = {};
                newProvince.province = province.province;
                newProvince.confirmed = province.confirmed;
                newProvince.deaths = province.deaths;
                newProvince.recovered = province.recovered;
                results.push(newProvince);
            });
            $("table tr:first th:first").html("Province");
            $("table tr:first th:last").remove();
            results.map(obj => {
                $('#table > tbody:last')
                    .append($(`
                        <tr>
                            <td>${obj.province}</td>
                            <td>${obj.deaths}</td>
                            <td>${obj.confirmed}</td>
                            <td>${obj.recovered}</td>
                        </tr>
                    `));
            })
        })
    }

    return {
        loadData: () => {
            initMap();
            apiclient.getAllCountries((data, error) => {
                if (error != null) {
                    console.log(error);
                    alert('Error to get the data from API');
                    return;
                }
                const results = [];
                data.data.covid19Stats.map(country => {
                    const newCountry = {};
                    newCountry.country = country.country;
                    newCountry.deaths = country.deaths;
                    newCountry.confirmed = country.confirmed;
                    newCountry.recovered = country.recovered;
                    results.push(newCountry);
                });
                results.map(obj => {
                    $('#table > tbody:last')
                        .append($(`
                            <tr>
                                <td>${obj.country}</td>
                                <td>${obj.deaths}</td>
                                <td>${obj.confirmed}</td>
                                <td>${obj.recovered}</td>
                                <td><button class="btn btn-primary">More</td>
                            </tr>
                        `).on("click", "button", () => getProvince(obj.country)));
                });
            })
        }
    }
})();