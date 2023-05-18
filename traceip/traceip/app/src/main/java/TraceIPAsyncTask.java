public class TraceIPAsyncTask {
    @Override
    protected String doInBackground(String... params) {
        String ipAddress = params[0];
        try {
            URL url = new URL("https://api.ipgeolocation.io/ipgeo?apiKey=YOUR_API_KEY&ip=" + ipAddress);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

        }
