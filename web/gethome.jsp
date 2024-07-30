<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Rent Management System</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.19.0/font/bootstrap-icons.css"></script>

    <link rel="stylesheet" href="gethome.css">
  </head>
  <body>
       
  <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
  <div class="container">
      <a class="navbar-brand" href="#"><span class="text-warning">Get</span>Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="#home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#about">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#services">Services</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#portfolio">Portfolio</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="#team">Team</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="mailto:rathoreaniket70@gmail.com">Contact</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
      
<div id="carouselExampleCaptions" class="carousel slide">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="image/home-1.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption">
        <h5>Your Dream House</h5>
        <p>Some representative placeholder content for the first slide.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="image/home-2.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption">
        <h5>Rent Management</h5>
        <p>Some representative placeholder content for the first slide.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="image/home-3.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption">
        <h5>True Emotions</h5>
        <p>Some representative placeholder content for the first slide.</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
      
      
      
      
      
      
      
      <!--about section-->
      
      <section id="about" class="about section-padding">
          <div class="container">
              <div class="row">
                  <div class="col-lg-4 col-md-12 col-12">
                      <div class="about-img">
                          <img src="image/about.jpg" alt="" class="img-fluid">
                      </div>
                  </div>
                  <div class="col-lg-8 col-md-12 col-12 ps-lg-5 mt-md-5">
                      <div class="about-text">
                          <h2> We Provide Best Quality<br>Services Ever</h2>
                          <p>Get Home is an Web application which aims  to creating an online platform that connects 
                          landlord and occupier directly,eliminating the need for Rent Management Brockers.
                          This innovative platform will empower landlords to give on rent his properties with greater transparency
                          ,efficiency and cost-effectiveness</p>
                           <p>Get Home simplifies the rental process, offering features such as direct communication, real-time updates, and secure transactions. 
                           This not only reduces the overall costs associated with renting but also enhances the renting experience for both landlords and tenants.</p>
                      </div>
                  </div>
              </div>
          </div>
      </section>
      
      <!--services section-->
      
      <section id="services" class="services section-padding">
          <div class="container">
              <div class="row">
                  <div class="col-md-12">
                      <div class="section-header text-center pb-5">
                          <h2>Our services</h2>
                          <p>For Accessing over Services First you have to sign in according to your Eligibility.</p>
                      </div>
                  </div>
              </div>
              <div class="row">
                  <div class="col-12 col-md-12 col-lg-4">
                    <div class="card text-dark text-center bg-light pb-2">
                          <div class="card-body">
                              <i class="bi bi-houses"></i>
                              <h3 class="card-title">Landlord</h3>
                              <p class="lead">The owner of property(such as land,houses,or apartmants )that is leased or rented to another.
                              the master of an inn or lodging house:</p>
                              <a href="landlordlogin.jsp"><button class="btn btn-warning text-light">Sign In</button></a>
                         </div>
                      </div>
                    </div>
              <div class="col-12 col-md-12 col-lg-4">
                      <div class="card text-dark text-center bg-light pb-2">
                          <div class="card-body">
                              <i class="bi bi-stripe"></i>
                              <h3 class="card-title">Occupier[School Student]</h3>
                              <p class="lead">If an occupants is a student than he will register on this option.
                                  This will be accessible for students whose age is between 16-20.</p>
                              <a href="occupierlogin18-22.jsp"><button class="btn btn-warning text-light">Sign In</button></a>
                          </div>
                      </div>
                  </div>
                <div class="col-12 col-md-12 col-lg-4">
                      <div class="card text-dark text-center bg-light pb-2">
                          <div class="card-body">
                              <i class="bi bi-bank"></i>
                              <h3 class="card-title">Occupier[Collage Student]</h3>
                              <p class="lead">If an occupants is a collage Student or Job holder than he will register on this option.
                                  This will be accessible for students whose age is between 21-29.</p>
                              <a href="occupierlogin23-30.jsp"><button class="btn btn-warning text-light">Sign In</button></a>
                          </div>
                      </div>
                  </div>
                <div class="col-12 col-md-12 col-lg-4">
                      <div class="card text-dark text-center bg-light pb-2">
                          <div class="card-body">
                              <i class="bi bi-person"></i>
                              <h3 class="card-title">Occupier[30+ and Married]</h3>
                              <p class="lead">If an occupants is a Married or 30+ Age than he will register on this option.
                                  This will be accessible for students whose age is between 30+.</p>
                              <a href="occupierlogin30.jsp"><button class="btn btn-warning text-light">Sign In</button></a>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </section>
      
      <!--portfolio section -->
      
      <section id="portfolio" class="portfolio section-padding">
          <div class="container">
               <div class="row">
                  <div class="col-md-12">
                      <div class="section-header text-center pb-5">
                          <h2>Our Projects</h2>
                          <p>On the Insert tab, the galleries include <br>items that are designed to coordinate with the overall look </p>
                        </div>
                    </div>
                </div>
              <div class="row">
                <div class="col-12 col-md-12 col-lg-4">
                      <div class="card text-light text-center bg-dark pb-2">
                          <div class="card-body text-light">
                              <div class="img-area md-4">
                                  <img src="image/project-1.jpg" alt="" class="img-fluid">
                              </div>
                              <h3 class="card-title">Building Make</h3>
                              <p class="lead">On the Insert tab, the galleries include items that are designed to coordinate with the overall look of your document.
                                  You can use these galleries to insert tables, headers, footers, lists, cover pages, and other document building blocks. 
                              </p>
                          </div>
                      </div>
                  </div>
                  <div class="col-12 col-md-12 col-lg-4">
                      <div class="card text-light text-center bg-dark pb-2">
                          <div class="card-body text-light">
                              <div class="img-area md-4">
                                  <img src="image/project-2.jpg" alt="" class="img-fluid">
                              </div>
                              <h3 class="card-title">Building Make</h3>
                              <p class="lead">On the Insert tab, the galleries include items that are designed to coordinate with the overall look of your document.
                                  You can use these galleries to insert tables, headers, footers, lists, cover pages, and other document building blocks. 
                              </p>
                          </div>
                      </div>
                  </div>
                <div class="col-12 col-md-12 col-lg-4">
                      <div class="card text-light text-center bg-dark pb-2">
                          <div class="card-body text-light">
                              <div class="img-area md-4">
                                  <img src="image/project-3.jpg" alt="" class="img-fluid">
                              </div>
                              <h3 class="card-title">Building Make</h3>
                              <p class="lead">On the Insert tab, the galleries include items that are designed to coordinate with the overall look of your document.
                                  You can use these galleries to insert tables, headers, footers, lists, cover pages, and other document building blocks. 
                              </p>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </section>
      
      <!--team section-->
      
      <section id="team" class="team section-padding">
          <div class="container">
              <div class="row">
                  <div class="col-md-12">
                      <div class="section-header text-center pb-5">
                          <h2>Our Team</h2>
                          <p>On the Insert tab, the galleries include <br>items that are designed to coordinate with the overall look </p>
                        </div>
                    </div>
                </div>
              <center>
              <div class="row">
                  <div class="col-12 col-md-6 col-lg-3">
                      <div class="card text-center">
                          <div class="card-body">
                              <img src="image/founder.jpeg" alt="" class="img-fluid rounded-circle">
                              <h3 class="card-title py-2">Aniket Rathore</h3>
                              <p class="card-text">Back End Developer </p>
                              
                              <p class="socials">
                                  <a href="https://www.facebook.com/aniket.rathore.1297943?mibextid=ZbWKwL" class="btn btn-primary" target="_blank" rel="noopener noreferrer"> <i class="bi bi-facebook text-dark mx-1"></i></a>
                                  <a href="https://instagram.com/aniket_rathore_123?igshid=MzMyNGUyNmU2YQ==" class="btn btn-primary" target="_blank" rel="noopener noreferrer"><i class="bi bi-linkedin text-dark mx-1"></i></a>
                                  <a href="https://www.linkedin.com/in/aniket-rathore-56047924a" class="btn btn-primary" target="_blank" rel="noopener noreferrer"><i class="bi bi-instagram text-dark mx-1"></i></a>
                              </p>
                          </div>
                      </div>
                  </div>
                  <div class="col-12 col-md-6 col-lg-3">
                      <div class="card text-center">
                          <div class="card-body">
                              <img src="image/Front.jpeg" alt="" class="img-fluid rounded-circle">
                              <h3 class="card-title py-2">Shivam Jat</h3>
                              <p class="card-text"> Front End Developer</p>
                              
                              <p class="socials">
                                  <a href="https://www.linkedin.com/in/shivam-jaat-0935262aa?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app" class="btn btn-primary" target="_blank" rel="noopener noreferrer"><i class="bi bi-linkedin text-dark mx-1"></i></a>
                                  <a href="https://www.instagram.com/1shivam.jaat?igsh=NGVhN2U2NjQ0Yg==" class="btn btn-primary" target="_blank" rel="noopener noreferrer"><i class="bi bi-instagram text-dark mx-1"></i></a>
                              </p>
                          </div>
                      </div>
                  </div>
                  <div class="col-12 col-md-6 col-lg-3">
                      <div class="card text-center">
                          <div class="card-body">
                              <img src="image/DBA.jpeg" alt="" class="img-fluid rounded-circle">
                              <h3 class="card-title py-2">Niraj Mahajan</h3>
                              <p class="card-text">Database Administrator</p>
                              
                              <p class="socials">
                                  <a href="https://www.linkedin.com/in/niraj-mahajan-4547a5218" class="btn btn-primary" target="_blank" rel="noopener noreferrer"><i class="bi bi-linkedin text-dark mx-1"></i></a>
                                  <a href="https://instagram.com/thename_isniraj?utm_source=qr&igshid=NGExMmI2YTkyZg%3D%3D" class="btn btn-primary" target="_blank" rel="noopener noreferrer"><i class="bi bi-instagram text-dark mx-1"></i></a>
                              </p>
                          </div>
                      </div>
                  </div>
               </div>
          </center>
      </section>
      

      <!--footer -->
      
      <footer class="bg-dark p-2 text-center">
          <div class="container">
              <p class="text-white"> All Right Reserved @website Name</p>
          </div>
      </footer> 



      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" ></script>

  </body>
</html>
