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
       },
       type: 'GET'
    });
});