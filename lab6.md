| Resources  | HTTP Verb | Resource URL                                                                               | Use Case                                                |
| ---------- | --------- | ------------------------------------------------------------------------------------------ | ------------------------------------------------------- |
| Ticket     | GET       | /zoos/{zoo_id}/tickets                                                                     | Get all tickets in a zoo                                |
| Visitors   | POST      | /zoos/{zoo_id}/tickets                                                                     | Creating a ticket at a zoo                              |
| Enclosures | GET       | /zoos/{zoo_id}/tickets/{ticket_id}                                                         | Get ticket with specified ID at a zoo                   |
| Tasks      | POST      | /zoos/{zoo_id}/visitors/{visitor_id}/tickets                                               | Visitor buying a ticket at a zoo                        |
| Options    | GET       | /zoos/{zoo_id}/visitors/{visitor_id}/tickets                                               | Get the ticket(s) of a visitor at a zoo                 |
| Animals    | OPTIONS   | /visitors/2/zoos/{zoo_id}                                                                  | Visitor checking what they can do at a zoo              |
| Feeds      | GET       | /zoos/{zoo_id}/visitors/{visitor_id}/tasks                                                 | Visitor can select from tasks                           |
| Shops      | DELETE    | /zoos/{zoo_id}/visitors/{visitor_id}/tickets                                               | Deleting the ticket of a visitor leaving the zoo        |
| Products   | GET       | /zoos/{zoo_id}/enclosures                                                                  | Get all enclosures in a zoo                             |
| Purchase   | GET       | /zoos/{zoo_id}/enclosures/{enclosures_id}/options                                          | Get all options of things to do in an enclosure         |
| Hospitals  | GET       | /zoos/{zoo_id}/enclosures/{enclosures_id}/animals                                          | Get all animals from an enclosure                       |
| Lecture    | POST      | /zoos/{zoo_id}/enclosures/{enclosures_id}/animals/{animal_id}/feeds                        | Feed an animal inside an enclosure                      |
| Listen     | POST      | /zoos/{zoo_id}/shops/{shop_id}/products/{product_id}/purchases/visitors/{visitor_id}       | Visitor purchases a product at a shop in the zoo        |
|            | GET       | /zoos/{zoo_id}/shops/{shop_id}/products                                                    | Get all products in a shop                              |
|            | GET       | /zoos/{zoo_id}/shops/{shop_id}/options                                                     | Get all options of things to do in a shop               |
|            | GET       | /zoos/{zoo_id}/hospitals/{hospital_id}/options                                             | Get all options of things to do in a hospital           |
|            | POST      | /zoos/{zoo_id}/hospitals/{hospital_id}/lectures/{lecture_id}/listens/visitors/{visitor_id} | Visitor listens to a lecture at the hospital in the Zoo |