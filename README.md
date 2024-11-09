Car-Share System

Overview:
Design a system to manage car-sharing with the following functionalities.

Functionalities:

The system permits users to participate in ride-sharing along a specific path.
Users have the option to provide a shared journey (Driver) or join one (Passenger).
Multiple available trips with the identical starting and ending point can be browsed and chosen by users.
Specifications:

The system should handle user registration.
a. register_user(user_info)
Input fundamental user information.
b. register_vehicle(vehicle_info)
Enter details of the user’s vehicle(s).
A user must be able to propose a shared trip with details.
a. propose_trip(trip_info)

Information such as vehicle type, start location, endpoint, and seat availability should be included. (There shouldn't be any stops between start and endpoint.)
Among various proposed journeys, users should be able to pick one based on a strategy. (A user can request a ride for either themselves or one other person.)

	a. choose_trip(start_location, end_location, seat_count, strategy)

Preferred Vehicle type (Activa/Polo/XUV)
Maximum available seats.
The ride's conclusion should be managed by the system. A ride for a particular vehicle can only be proposed by a user if there are no ongoing proposals for that vehicle.
a. conclude_trip(trip_info)

Display the total number of journeys proposed or joined by all participants.
a. show_trip_summary()

Additional Task:

If direct routes aren't available but can be achieved through multiple journeys, the system should suggest these combinations. (For instance, if the input is Bangalore to Mumbai, it can suggest Bangalore to Goa followed by Goa to Mumbai).
Further Instructions:

Compose a main class for demonstration, executing all commands and test scenarios together.
Refrain from using databases or NoSQL. Rely on in-memory data structures.
The design doesn't need a user interface.
The emphasis should be on ensuring the code compiles, runs, and achieves the desired results.
Focus on achieving the specified output, after which you can introduce optional enhancements.
Expectations:

Ensure your code is operational and can be showcased.
Functionality correctness is vital.
Abstraction, design modeling, and distinct responsibilities should be evident.
The code should be modular, understandable, and prepared for unit testing.
Introducing new requirements should necessitate only slight modifications.
Proper error management is crucial.
Example Test Scenarios:

Registering 5 participants:

For simplicity, I will show only one registration instead of listing all to avoid repetition:
register_user(“Rohan, M, 36”); register_vehicle(“Rohan, Swift, KA01-12345”)
3 users offering 4 different trips:

For simplicity, I will show only one offering instead of listing all to avoid repetition:
propose_trip(“Rohan, Start=Hyderabad, Seats=1, Vehicle=Swift, KA-01-12345, End= Bangalore”)
Searching for trips for 4 users:

For simplicity, I will show only one search instead of listing all to avoid repetition:
choose_trip(“Nandini, Start=Bangalore, End=Mysore, Seats=1, Maximum Seats Available”)
Ending trips:

For simplicity, I will show only one end action instead of listing all to avoid repetition:
conclude_trip(2-a)
Displaying user's trip record: Trips that have concluded are the ones considered. Even if no user joined a proposed trip, it's still considered as offered.

For simplicity, I will show only one summary action:
show_trip_summary()
