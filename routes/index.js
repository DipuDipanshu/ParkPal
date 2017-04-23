        var express = require('express');
		var router = express.Router();
		var mysql = require("mysql");
	    var hbs = require("hbs");
	    var async = require("async");
	    var regression  = require("regression");


	    hbs.registerHelper('parseJson', function(context) {
	    return JSON.stringify(context);
	    });

	    var connection = mysql.createConnection({
						host:'localhost',
						user : 'root',
						password : '',
						database : 'COTS'
					});
	 
	    connection.connect(function(err){
				if(err){
		  			console.log(err);
				}else{
		  			console.log('connected');
				}
		});



		/* GET home page. */
		router.get('/', function(req, resp) {
			connection.query("SELECT * FROM p_data", function(error, rows, fields){
				if(!!error){
					console.log('Error in the query');
				} else {
					var i=0
					 console.log('SUCESS!\n');
					 console.log(rows);
					 resp.send("Hello, " + rows);
					 
				
				}

			});
  		});

  		router.get('/data', function(req, resp){
  			var data1 = req.query.data1;
  			var data2 = req.query.data2;
  			var data3 = req.query.data3;
  			var data4 = req.query.data4;

  			if(req.query.data != 0){
  				connection.query({
  					sql : 'insert into p_data(verifykey, number, floor, slot) values(?, ?, ?, ?)',
  					values : [data1, data2, data3, data4]

  				}, function(err, resp){
  					if(err){
  						console.log("Error in inserting p_data " +e );
  					}else{
  						console.log("Insertion SUCCESSFUL");
  					}
  				});
  				}
  				//console.log("from connected user: " 
  				//	+ data);
  				//data = data.toUpperCase();
  				//console.log("sending: " + data);
  				//resp.send(data);
  			res.send(SUCCESSFUL);

  		});
  	

        module.exports = router;
