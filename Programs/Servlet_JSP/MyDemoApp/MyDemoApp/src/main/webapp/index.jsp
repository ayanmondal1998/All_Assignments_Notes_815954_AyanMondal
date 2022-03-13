<html>
<body>
	<h2>Hello World!</h2>
	<h2>show</h2>


	<form action="getAlien" method="get">

		<input type="text" name="aid"> <input type="submit">

	</form>

	<h2>insert</h2>

	<form action="getAlien" method="post">

		<input type="text" name="aid" placeholder="aid"> <input
			type="text" name="name" placeholder="name"> <input
			type="text" name="tech" placeholder="tech">
			<input type="hidden" name="flag" value="insert">
		   <input type="submit">

	</form>

	<h2>update</h2>

	<form action="getAlien" method="post">

		<input type="text" name="aid" placeholder="aid"> <input
			type="text" name="name" placeholder="name"> <input
			type="text" name="tech" placeholder="tech">
			<input type="hidden" name="flag" value="update">
			 <input
			type="submit">

	</form>

	<h2>delete</h2>

	<form action="getAlien" method="post">

		<input type="text" name="aid"
			placeholder="enter the id you want to delete">
			<input type="hidden" name="flag" value="delete">
			 <input type="submit">

	</form>


</body>
</html>
