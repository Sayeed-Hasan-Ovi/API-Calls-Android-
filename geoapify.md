Sayeed-Hasan-Ovi: 


### Updated Code
```java

    String apiKey = "599464d94be84c0296fe3edc809c01ca";
    String url = "https://api.geoapify.com/v2/
    place-details?lat=23.756080876788374&   lon=90.36752478086112&features=radius_500,radius_500.atm&apiKey="       + apiKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize OkHttpClient and Gson instances
        client = new OkHttpClient();
        gson = new Gson();

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "Request Failed", e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String responseData = response.body().string();
                    JsonObject jsonObject = gson.fromJson(responseData, JsonObject.class);
                    Log.d(TAG, "Response: " + jsonObject.toString());
                } else {
                    Log.e(TAG, "Request Failed: " + response.code());
                }
            }
        });

```

### Setting the Environment Variable
In your terminal, set the environment variable before running your application:
```sh
export GEOAPIFY_API_KEY=599464d94be84c0296fe3edc809c01ca

Sayeed-Hasan-Ovi: 


### Updated Code
```java

    String apiKey = "599464d94be84c0296fe3edc809c01ca";
    String url = "https://api.geoapify.com/v2/
    place-details?lat=23.756080876788374&   lon=90.36752478086112&features=radius_500,radius_500.atm&apiKey="       + apiKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize OkHttpClient and Gson instances
        client = new OkHttpClient();
        gson = new Gson();

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "Request Failed", e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String responseData = response.body().string();
                    JsonObject jsonObject = gson.fromJson(responseData, JsonObject.class);
                    Log.d(TAG, "Response: " + jsonObject.toString());
                } else {
                    Log.e(TAG, "Request Failed: " + response.code());
                }
            }
        });

```

### Setting the Environment Variable
In your terminal, set the environment variable before running your application:
```sh
export GEOAPIFY_API_KEY=599464d94be84c0296fe3edc809c01ca
```


```json
{
  "type": "FeatureCollection",
  "features": [
    {
      "type": "Feature",
      "properties": {
        "feature_type": "radius_500",
        "type": "radius",
        "range": 500,
        "lat": 23.756080876788374,
        "lon": 90.36752478086112,
        "area": 785893
      },
      "geometry": {
        "type": "Polygon",
        "coordinates": [
          [
            [90.36752478086112, 23.760577478607],
            [90.36704321824521, 23.760555825494006],
            [90.36656629381739, 23.760491074707833],
            [90.36609860107903, 23.760383849897615],
            [90.36564464458951, 23.760235183800237],
            [90.36520879656828, 23.76004650829061],
            [90.36479525477394, 23.759819640586525],
            [90.36440800206587, 23.759556765741365],
            [90.36405076803837, 23.759260415593413],
            [90.36372699309729, 23.758933444374797],
            [90.36343979532526, 23.75857900121528],
            [90.3631919404547, 23.758200499806048],
            [90.36298581523756, 23.757801585515907],
            [90.3628234044684, 23.757386100276996],
            [90.36270627188134, 23.756958045578344],
            [90.36263554510461, 23.756521543924006],
            [90.36261190481737, 23.756080799127137],
            [90.36263557821174, 23.755640055822496],
            [90.36270633682328, 23.75520355858753],
            [90.36282349874952, 23.754775511065553],
            [90.36298593523465, 23.754360035484815],
            [90.36319208155635, 23.753961132963184],
            [90.363439952109, 23.753582644980554],
            [90.36372715953802, 23.753228216389747],
            [90.36405093773986, 23.752901260322087],
            [90.36440816850661, 23.7526049253251],
            [90.3647954115577, 23.752342065048655],
            [90.36520893766992, 23.752115210771173],
            [90.3656447645866, 23.75192654703006],
            [90.36609869536015, 23.751777890590855],
            [90.36656635875933, 23.751670672957307],
            [90.36704325135233, 23.751605926590507],
            [90.36752478086112, 23.751584274969748],
            [90.36800631036988, 23.751605926590507],
            [90.36848320296289, 23.751670672957307],
            [90.36895086636207, 23.751777890590855],
            [90.36940479713562, 23.75192654703006],
            [90.36984062405229, 23.752115210771173],
            [90.37025415016451, 23.752342065048655],
            [90.3706413932156, 23.7526049253251],
            [90.37099862398235, 23.752901260322087],
            [90.3713224021842, 23.753228216389747],
            [90.3716096096132, 23.753582644980554],
            [90.37185748016586, 23.753961132963184],
            [90.37206362648756, 23.754360035484815],
            [90.3722260629727, 23.754775511065553],
            [90.37234322489894, 23.75520355858753],
            [90.37241398351047, 23.755640055822496],
            [90.37243765690484, 23.756080799127137],
            [90.37241401661761, 23.756521543924006],
            [90.37234328984088, 23.756958045578344],
            [90.37222615725379, 23.757386100276996],
            [90.37206374648464, 23.757801585515907],
            [90.37185762126751, 23.758200499806048],
            [90.37160976639696, 23.75857900121528],
            [90.37132256862493, 23.758933444374797],
            [90.37099879368385, 23.759260415593413],
            [90.37064155965633, 23.759556765741365],
            [90.37025430694828, 23.759819640586525],
            [90.36984076515394, 23.76004650829061],
            [90.36940491713271, 23.760235183800237],
            [90.36895096064318, 23.760383849897615],
            [90.36848326790484, 23.760491074707833],
            [90.36800634347699, 23.760555825494006],
            [90.36752478086112, 23.760577478607]
          ]
        ]
      }
    },
    {
      "type": "Feature",
      "properties": {
        "name": "Mutual Trust Bank",
        "country": "Bangladesh",
        "country_code": "bd",
        "state": "Dhaka Division",
        "county": "Dhaka District",
        "city": "Dhaka",
        "municipality": "Dhaka Metropolitan",
        "postcode": "1207",
        "suburb": "Mohammadpur",
        "quarter": "Bashbari",
        "street": "Asad Avenue",
        "housenumber": "11/39",
        "lon": 90.3644259,
        "lat": 23.7588799,
        "formatted": "Mutual Trust Bank, 11/39 Asad Avenue, Mohammadpur, Dhaka - 1207, Bangladesh",
        "address_line1": "Mutual Trust Bank",
        "address_line2": "11/39 Asad Avenue, Mohammadpur, Dhaka - 1207, Bangladesh",
        "categories": [
          "service",
          "service.financial",
          "service.financial.atm"
        ],
        "details": [
          "details",
          "details.facilities",
          "details.wiki_and_media"
        ],
        "datasource": {
          "sourcename": "openstreetmap",
          "attribution": "© OpenStreetMap contributors",
          "license": "Open Database License",
          "url": "https://www.openstreetmap.org/copyright",
          "raw": {
            "name": "Mutual Trust Bank",
            "brand": "Mutual Trust Bank",
            "branch": "Mohammadpur",
            "osm_id": 6908311146,
            "amenity": "atm",
            "operator": "Mutual Trust Bank",
            "osm_type": "n",
            "wikidata": "Q22907128",
            "wikipedia": "en:Mutual Trust Bank Limited",
            "wheelchair": "no",
            "currency:BDT": "yes",
            "drive_through": "no",
            "opening_hours": "24/7"
          }
        },
        "opening_hours": "24/7",
        "brand": "Mutual Trust Bank",
        "operator": "Mutual Trust Bank",
        "branch": "Mohammadpur",
        "facilities": {
          "wheelchair": "no"
        }
      }
    }
  ]
}
```