<%--
  Created by IntelliJ IDEA.
  User: vitox
  Date: 13-07-2023
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Ejercicio Grupal 1</title>
  <meta name = "format-detection" content = "telephone=no" />
  <link rel="icon" href="images/favicon.ico" type="image/x-icon">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/font-awesome.css">
  <link rel="stylesheet" href="css/jquery.fancybox-1.3.4.css">
  <link rel="stylesheet" href="css/owl.carousel.css" >
  <link rel="stylesheet" href="css/touch_styles.css" />
  <script src="js/jquery.js"></script>
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
  <script src="js/jquery-migrate-1.2.1.js"></script>
  <script src="js/jquery.easing.1.3.js"></script>
  <script src="js/script.js"></script>
  <script src="search/search.js"></script>
  <script src="js/jquery.equalheights.js"></script>
  <script src="js/jquery.ui.totop.js"></script>
  <script src="js/owl.carousel.js"></script>
  <script src="js/superfish.js"></script>
  <script src="js/jquery.mobilemenu.js"></script>
  <script src="js/jquery.fancybox-1.3.4.js"></script>
  <script src="js/touchTouch.jquery.js"></script>
  <!--[if lt IE 8]>
  <link rel="stylesheet" type="text/css" media="screen" href="css/ie.css">
  <link href='//fonts.googleapis.com/css?family=Asap:400' rel='stylesheet' type='text/css'>
  <link href='//fonts.googleapis.com/css?family=Asap:700' rel='stylesheet' type='text/css'>
  <link href='//fonts.googleapis.com/css?family=Lato:400' rel='stylesheet' type='text/css'>
  <link href='//fonts.googleapis.com/css?family=Lato:700' rel='stylesheet' type='text/css'>
  <div style=' clear: both; text-align:center; position: relative;'>
    <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
      <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
    </a>
  </div>
  <![endif]-->
  <!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <link rel="stylesheet" type="text/css" media="screen" href="css/ie.css">
  <![endif]-->
  <script>
    $(document).ready(function(){
      $("#owl").owlCarousel({
        items : 9,
        itemsDesktop : [1299, 9],
        itemsTablet: [995, 7],
        itemsTabletSmall: [767, 4],
        itemsMobile : [479, 3],
        lazyLoad : true,
        pagination: false,
        navigation : false
      });
      $("#owl-1").owlCarousel({
        items : 4,
        itemsDesktop : [1299, 4],
        itemsTablet: [995, 3],
        itemsTabletSmall: [767, 1],
        itemsMobile : [479, 1],
        lazyLoad : true,
        pagination: true,
        navigation : false
      });
      $("#owl-2").owlCarousel({
        items : 4,
        itemsDesktop : [1299, 4],
        itemsTablet: [995, 4],
        itemsTabletSmall: [767, 1],
        itemsMobile : [479, 1],
        lazyLoad : true,
        pagination: false,
        navigation : true
      });
      /*fancybox*/
      $("a.various").fancybox();
      /*gallery*/
      $('.magnifier').touchTouch();
      /*accordion*/
      $(function() {
        var icons = {
          header: "fa fa-plus-square",
          activeHeader: "fa fa-minus-square"
        };
        $( "#accordion" ).accordion({
          icons: icons,
          header: "> div > h5"
        });
        $( "#toggle" ).button().click(function() {
          if ( $( "#accordion" ).accordion( "option", "icons" ) ) {
            $( "#accordion" ).accordion( "option", "icons", null );
          } else {
            $( "#accordion" ).accordion( "option", "icons", icons );
          }
        });
      });
      /*Back to Top*/
      $().UItoTop({ easingType: 'easeOutQuart' });
    });
  </script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

</head>
<body id="top">
<%@include file="layout/header.jsp" %>
<div class="container">
<div id="content">
  <div class="banner">
    <div class="container">
      <div class="row">
        <div class="grid_12">
          <div class="caption">
            <p>“One of the most interesting things about doing this [UFO] research as I do it, is getting to know the other researchers or witnesses better and learning about their other interests or talents.”</p>
            <span>Dennis Balthaser, the scientist</span>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="bg1 p65">
    <div class="container">
      <div class="row">
        <div class="grid_12">
          <div class="intro">
            <img src="images/logotype.png" alt="">
            <h3>Welcome to our site!</h3>
            <h4>We present in-depth and quality research, resources and information on <br>the UFO phenomenon</h4>
            <div>
              <a href="#" class="link blue">view articles <i class="fa fa-arrow-right"></i></a>
              <a href="#" class="link red">create a report <i class="fa fa-arrow-right"></i></a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="banner1">
    <div class="p91">
      <div class="container">
        <div class="row">
          <div class="grid_4">
            <div class="thumb">
              <img src="images/page1_img1.png" alt="">
              <h5><a href="#" class="link1">Another Approach</a></h5>
              <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab ilventore veritatis et quasi architecto beatae vitae dicta sunt.</p>
            </div>
          </div>
          <div class="grid_4">
            <div class="thumb">
              <img src="images/page1_img2.png" alt="">
              <h5><a href="#" class="link1">Conceptualizing UFOs</a></h5>
              <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab ilventore veritatis et quasi architecto beatae vitae dicta sunt.</p>
            </div>
          </div>
          <div class="grid_4">
            <div class="thumb">
              <img src="images/page1_img3.png" alt="">
              <h5><a href="#" class="link1">Searching For the Truth</a></h5>
              <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab ilventore veritatis et quasi architecto beatae vitae dicta sunt.</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="bg1 p86">
    <div class="container">
      <div class="row">
        <div class="grid_12">
          <div class="intro">
            <h3>Selected UFO Cases</h3>
            <h4>Never before in the research of Ufology, has there been a more <br>important time for obtaining the truth than today</h4>
          </div>
          <div id="owl-1" class="owl-carousel">
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img4.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img5.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img6.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img7.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img4.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img5.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img6.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img7.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img4.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img5.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img6.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img7.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img4.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img5.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img6.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
            <div class="item">
              <div class="thumb1">
                <img src="images/page1_img7.jpg" alt="">
                <div><a href="#">Epsum factorial</a>
                  <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem </p></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="banner2">
    <div class="p91">
      <div class="container">
        <div class="row">
          <div class="grid_6">
            <div class="grid_3 alpha">
              <div class="box">
                <div>
                  <span><i class="fa fa-group"></i></span>
                  <a href="#">Epsum factorial non</a>
                </div>
                <p>Epsum factorial non deposit quid pro quo hic escorol. Olypian qua et gorilla congolium sic ad nauseum ouvlaki ignitus.</p>
              </div>
              <div class="box">
                <div>
                  <span><i class="fa fa-fire"></i></span>
                  <a href="#">Epsum factorial non</a>
                </div>
                <p>Epsum factorial non deposit quid pro quo hic escorol. Olypian qua et gorilla congolium sic ad nauseum ouvlaki ignitus.</p>
              </div>
            </div>
            <div class="grid_3 omega">
              <div class="box">
                <div>
                  <span><i class="fa fa-gears"></i></span>
                  <a href="#">Epsum factorial non</a>
                </div>
                <p>Epsum factorial non deposit quid pro quo hic escorol. Olypian qua et gorilla congolium sic ad nauseum ouvlaki ignitus.</p>
              </div>
              <div class="box">
                <div>
                  <span><i class="fa fa-bullhorn"></i></span>
                  <a href="#">Epsum factorial non</a>
                </div>
                <p>Epsum factorial non deposit quid pro quo hic escorol. Olypian qua et gorilla congolium sic ad nauseum ouvlaki ignitus.</p>
              </div>
            </div>
          </div>
          <div class="grid_6 thumbs">
            <a class="various iframe" href="http://player.vimeo.com/video/37582125">
              <img src="images/video.jpg" alt=""></a>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="bg1 p50">
    <div class="container">
      <div class="row">
        <div class="grid_12">
          <h2>UFO-Related News</h2>
        </div>
      </div>
      <div class="row">
        <div id="owl-2" class="owl-carousel">
          <div class="grid_3">
            <div class="item">
              <div class="block">
                <a href="images/big1.jpg" class="magnifier">
                  <img src="images/page1_img8.jpg" alt=""></a>
                <div class="capture1">
                  <a href="#" class="link3">quid pro quo hic escorol Olypian puarrels et gorilla</a>
                  <div class="time"><time datetime="2014-05-15">15 may 2014</time> / <a href="#">6 comments</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="grid_3">
            <div class="item">
              <div class="block">
                <a href="images/big2.jpg" class="magnifier">
                  <img src="images/page1_img9.jpg" alt=""></a>
                <div class="capture1">
                  <a href="#" class="link3">quid pro quo hic escorol Olypian puarrels et gorilla</a>
                  <div class="time"><time datetime="2014-05-15">15 may 2014</time> / <a href="#">6 comments</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="grid_3">
            <div class="item">
              <div class="block">
                <a href="images/big3.jpg" class="magnifier">
                  <img src="images/page1_img10.jpg" alt=""></a>
                <div class="capture1">
                  <a href="#" class="link3">quid pro quo hic escorol Olypian puarrels et gorilla</a>
                  <div class="time"><time datetime="2014-05-15">15 may 2014</time> / <a href="#">6 comments</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="grid_3">
            <div class="item">
              <div class="block">
                <a href="images/big4.jpg" class="magnifier">
                  <img src="images/page1_img11.jpg" alt=""></a>
                <div class="capture1">
                  <a href="#" class="link3">quid pro quo hic escorol Olypian puarrels et gorilla</a>
                  <div class="time"><time datetime="2014-05-15">15 may 2014</time> / <a href="#">6 comments</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="grid_3">
            <div class="item">
              <div class="block">
                <a href="images/big1.jpg" class="magnifier">
                  <img src="images/page1_img8.jpg" alt=""></a>
                <div class="capture1">
                  <a href="#" class="link3">quid pro quo hic escorol Olypian puarrels et gorilla</a>
                  <div class="time"><time datetime="2014-05-15">15 may 2014</time> / <a href="#">6 comments</a></div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="divider"></div>
  <div class="bg1 p86">
    <div class="container">
      <div class="row">
        <div class="grid_4">
          <h2>Historical Ufology</h2>
          <div id="accordion">
            <div class="group">
              <i></i>
              <h5><a href="#">quid pro quo hic escorol </a></h5>
              <p>Epsum factorial non t quid pro quo hic escorol. Olypian quarrels et gorilngolium sic ad nauseum. Souvlaki ignitus carborundum e pluribus unuacto lingo est igpay atinlay. Marquee selectus non provisio incongruous.</p>
            </div>
            <div class="group">
              <i></i>
              <h5><a href="#">escorol Olypian puarrels et</a></h5>
              <p>Epsum factorial non t quid pro quo hic escorol. Olypian quarrels et gorilngolium sic ad nauseum. Souvlaki ignitus carborundum e pluribus unuacto lingo est igpay atinlay. Marquee selectus non provisio incongruous.</p>
            </div>
            <div class="group">
              <i></i>
              <h5><a href="#">Souvlaki ignitus carborundum</a></h5>
              <p>Epsum factorial non t quid pro quo hic escorol. Olypian quarrels et gorilngolium sic ad nauseum. Souvlaki ignitus carborundum e pluribus unuacto lingo est igpay atinlay. Marquee selectus non provisio incongruous.</p>
            </div>
          </div>
        </div>
        <div class="grid_4">
          <h2>Classification System</h2>
          <p class="lh21">Gratuitous octopus niacodiumtimate. Quote meon an estimate et non interruptus stadium. Sic tempus fugit esperanto hiccup estrogen. Glolava ex librus hup hey ad infinitum. Non sequitur condominium facile et geranium incognito. Epsum factorial non deposit quid pro quo hic escorol. Marquee ctus non prio incongruous feline nolo contendre Olypian rels et gongolium sic ad nauseum. Souvlaki ignitus carborundum.</p>
          <ul class="list">
            <li><a href="#"><i class="fa fa-check"></i>Physical Evidence - General</a></li>
            <li><a href="#"><i class="fa fa-check"></i>Electro-Magnetic Effects</a></li>
            <li><a href="#"><i class="fa fa-check"></i>Vehicle Interference Cases</a></li>
            <li><a href="#"><i class="fa fa-check"></i>Physical Trace Cases</a></li>
          </ul>
        </div>
        <div class="grid_4">
          <h2>Testimonials</h2>
          <blockquote>
            <div class="bq_top">
              <img src="images/quote.png" alt="">
              <p>Gratuitous octopus niacodiumtimate. Quote meon an estimate et nointerruptus stadium. Sic tempus fugit esperanto hicp estrogen. Glolava ex librus hup hey ad condominiacile et geranium incognito. Epsum factorial non.</p>
            </div>
            <div class="bq_bot">
              <img src="images/page1_img12.png" alt="">
              <a href="#">Andy Taylor</a><br>
              <span>Death of Ufology Project</span>
            </div>
          </blockquote>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="divider"></div>
<div class="bg1">
  <div class="container">
    <div class="row">
      <div class="grid_12">
        <div id="owl" class="owl-carousel">
          <div class="item"><a href="#"><img src="images/page1_ico1.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico2.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico3.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico4.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico5.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico6.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico7.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico8.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico9.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico1.png" alt=""></a></div>
          <div class="item"><a href="#"><img src="images/page1_ico2.png" alt=""></a></div>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="map">
  <iframe class="wide_map" src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d24214.807650104907!2d-73.94846048422478!3d40.65521573400813!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sus!4v1395650655094" style="border:0"></iframe>
</div>
<div class="p13">
  <div class="container">
    <div class="row">
      <div class="grid_3">
        <h6>Special Types of Sightings</h6>
        <ul class="list1">
          <li><a href="#">Pilot Sightings</a></li>
          <li><a href="#">Astronaut Sightings</a></li>
          <li><a href="#">UFO Landings</a></li>
          <li><a href="#">CE-5 / Human-Initiated Contact</a></li>
          <li><a href="#">Humanoid Sightings</a></li>
          <li><a href="#">Black Triangles</a></li>
          <li><a href="#">Water Related Sightings</a></li>
        </ul>
      </div>
      <div class="grid_3">
        <h6>Govt. & Scientific Studies</h6>
        <ul class="list1">
          <li><a href="#">Project Blue Book</a></li>
          <li><a href="#">Condon Report</a></li>
          <li><a href="#">Sturrock Panel</a></li>
          <li><a href="#">COMETA Report (France)</a></li>
          <li><a href="#">GEPAN / SEPRA (France)</a></li>
          <li><a href="#">Government Studies</a></li>
          <li><a href="#">Scientific Studies</a></li>
          <li><a href="#">U.S. Presidents & UFOs</a></li>
          <li><a href="#">United Nations & UFOs</a></li>
          <li><a href="#">UFO Disclosure</a></li>
          <li><a href="#">Public Opinion Polls on UFOs</a></li>
          <li><a href="#">Nuclear Facilities and UFOs</a></li>
          <li><a href="#">UFO Waves</a></li>
          <li><a href="#">UFO Crashes & Retrievals</a></li>
        </ul>
      </div>
      <div class="grid_3">
        <h6>Global Network</h6>
        <ul class="list1">
          <li><a href="#">Asia Pacific</a></li>
          <li><a href="#">Canada</a></li>
          <li><a href="#">Europe, Middle East & Africa</a></li>
          <li><a href="#">Latin America</a></li>
          <li><a href="#">United States</a></li>
        </ul>
        <h6>About Us</h6>
        <ul class="list1">
          <li><a href="#">Company Profile</a></li>
          <li><a href="#">Management Team</a></li>
          <li><a href="#">Company History</a></li>
          <li><a href="#">Contact Us</a></li>
          <li><a href="#">Locations</a></li>
          <li><a href="#">Ethics & Compliance</a></li>
        </ul>
      </div>

    </div>
  </div>
</div>

</div>


<%@include file="layout/footer.jsp" %>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</body>

</html>
