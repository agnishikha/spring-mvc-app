document.getElementById("helloBtn").onclick = function() {
    console.log('hi');
}

function enable() {
        $("#usersTable").css('display', 'block');
    }

$('#helloBtn').click(function() {

    $.ajax({
       url: '/users',
       error: function(e) {
          console.log('error', e);
       },
       success: function(data) {
          console.log('success', data);
          var noOfUsers = data.length;
          var table = document.createElement('table');
          var col = []; // define an empty array
          			for (var i = 0; i < noOfUsers; i++) {
          				for (var key in noOfUsers[i]) {
          					if (col.indexOf(key) === -1) {
          						col.push(key);
          					}
          				}
          			}
          	var tHead = document.createElement("thead");
          	var hRow = document.createElement("tr");

            for (var i = 0; i < col.length; i++) {
					var th = document.createElement("th");
					th.innerHTML = col[i];
					hRow.appendChild(th);
			}
			tHead.appendChild(hRow);
            table.appendChild(tHead);
            var tBody = document.createElement("tbody");
            for (var i = 0; i < noOfUsers; i++) {

            					var bRow = document.createElement("tr"); // CREATE ROW FOR EACH RECORD .


            					for (var j = 0; j < col.length; j++) {
            						var td = document.createElement("td");
            						td.innerHTML = data[i][col[j]];
            						bRow.appendChild(td);
            					}
            					tBody.appendChild(bRow)

            			}
            			table.appendChild(tBody);
            			var divContainer = document.getElementById("displayUsersTable");
                        divContainer.innerHTML = "";
                    	divContainer.appendChild(table);
  console.log('success');

       },
       type: 'GET'
    });
});