$(document).ready(function(){
    $("img").click(function(e){
		e.preventDefault();
        $.ajax({
			method: "GET",
			url: "field/" + $(this).attr("id"),
			context: this,
			success: function(response) {
				html = response;
				var filtSRC = $(html).find("img#" + $(this).attr("id")).attr("src");
				console.log(filtSRC);
				$(this).attr("src", filtSRC);
				var filtStatus = $(html).filter("div.winnerStatus");
				$(".winnerStatus").replaceWith(filtStatus);
			}
		});
    });

    $("#replayButton").click(function(f){
    	f.preventDefault();
    	$.ajax({
    		method: "GET",
    		url: "reset",
    		context: this,
    		success: function(response) {
    		html = response;
    		var filtTable = $(html).filter("table");
    		$("table").replaceWith(filtTable);
			var filtStatus = $(html).filter("div.winnerStatus");
			$(".winnerStatus").replaceWith(filtStatus);
    		}
    	});
    });
});