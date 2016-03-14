var cassandra = require('cassandra-driver');

var client = new cassandra.Client({
	contactPoints : [ '172.17.0.2', '172.17.0.3', '172.17.0.4', '172.17.0.5' ],
	keyspace : 'mykeyspace'
});

var query = 'SELECT fname, lname FROM users';
client.execute(query, function(error, result) {
	if (error) {
		console.log("Error at getting users: " + error);
		process.exit(0);
	} else {
		for ( var i in result.rows) {
			var user = result.rows[i];
			console.log(user.fname + ' ' + user.lname);
		}
	}
});