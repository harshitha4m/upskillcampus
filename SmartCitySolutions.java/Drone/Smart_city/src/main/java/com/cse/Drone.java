package com.cse;


		    import java.io.IOException;
	    
	    import Webcams.DetectMotion;
	    
	    public abstract class Drone implements Runnable, Camera
	    {
	        private String name;
	        private String model_number;
	        private String location;
	        private String latitude;
	        private String longitude;
	        public boolean isOccupied;
	        
	        public boolean isActivated=false;
	        
	        public String getName()
	        {
	            return name;
	        }
	        
	        public void setName(String name)
	        {
	            this.name = name;
	        }
	    
	        public String getModel_number()
	        {
	            return model_number;
	        }
	    
	        public void setModel_number(String model_number)
	        {
	            this.model_number = model_number;
	        }
	        
	        public String getLocation()
	        {
	            return location;
	        }
	    
	        public void setLocation(String location)
	        {
	            this.location = location;
	        }
	        
	        public void run()
	        {
	            System.out.println();
	        }
	    
	        public String getLatitude()
	        {
	            return latitude;
	        }
	    
	        public void setLatitude(String latitude)
	        {
	            this.latitude = latitude;
	        }
	    
	        public String getLongitude()
	        {
	            return longitude;
	        }
	    
	        public void setLongitude(String longitude)
	        {
	            this.longitude = longitude;
	        }
	        
	        public Drone(String name, String model_number, String location) throws Exception
	        {
	            this.setName(name);
	            this.setModel_number(model_number);
	            this.setLocation(location);
	            String[] coordinates;
				try {
					coordinates = GeoLocator.geoLocate(location);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            this.setLatitude(coordinates[0]);
	            this.setLongitude(coordinates[1]);
	        }
	        
	        public Drone(String name2, String model_number2, String location2) {
				// TODO Auto-generated constructor stub
			}

			public void startCamera(int time) throws IOException
	        {
	            DetectMotion.timeToStop=time;
	            DetectMotion.detectMotion();
	        }

			public void showImage(String a) throws IOException {
				// TODO Auto-generated method stub
				
			}
	        
	    }

	    
	    
	    
	


