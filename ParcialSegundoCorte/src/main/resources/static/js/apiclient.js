const apiclient = (() => {
    return {
        getAllCountries: (callback) => {
            const promise = $.get({
                url: '/covid/all',
                type: 'GET',
                contentType: "application/json"
            }).then(response => {
                callback(JSON.parse(response), null);
            }).catch(error => {
                callback(null, error);
            });
        },

        getAllDataByCountry: (country , callback) => {
            const promise = $.get({
                url: `/covid/${country}`,
                type: 'GET',
                contentType: "application/json"
            }).then(response => {
                callback(JSON.parse(response), null);
            }).catch(error => {
                callback(null, error);
            });
        },

        getCoordinateByCountry: (country, callback) => {
            const promise = $.get({
                url: `/coordinates/${country}`,
                type: 'GET',
                contentType: "application/json"
            }).then(response => {
                callback(JSON.parse(response),null);
            }).catch(error => {
                callback(null,error);
            })
        }
    }
})();