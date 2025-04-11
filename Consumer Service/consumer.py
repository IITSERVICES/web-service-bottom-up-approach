from zeep import Client

# Point to the WSDL URL of your running Java service
wsdl_url = 'http://localhost:8081/hello?wsdl'

# Create the SOAP client
client = Client(wsdl=wsdl_url)

# Call the sayHello method
response = client.service.sayHello("Imtiaz")

# Print the response
print("Response from Java SOAP Service:", response)
