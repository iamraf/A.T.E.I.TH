<html>
	<head>
		<title>Lab2_2</title>
   </head>

	<body <?php 
			$links = array("https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/2018/europeslostf.jpg", "https://static1.visitestonia.com/images/2890339/Estonian_forest_reasons_to_visit_Sven_Zacek.jpg", "https://www.forest-trends.org/wp-content/uploads/2017/04/acadia_np_622419-High-Res.jpg", "https://pbs.twimg.com/profile_images/874684553176207360/LK6rLfRh_400x400.jpg", "https://www.popsci.com/sites/popsci.com/files/styles/1000_1x_/public/images/2018/02/funko.jpg?itok=e2IFBqjQ");
			
			$random = rand(0, 5);
			
			echo 'style = background-image:url("' . $links[$random] . '");';
		?> >
    </body>
</html>