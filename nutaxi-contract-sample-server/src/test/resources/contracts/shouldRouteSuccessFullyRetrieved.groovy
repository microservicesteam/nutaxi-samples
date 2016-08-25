package contracts

org.springframework.cloud.contract.spec.Contract.make {
			request {
				method 'GET'
				url '/route/1'			
				headers {
					header('Content-Type', 'application/vnd.route.v1+json')
				}
			}
			response {
				status 200
				body([
					id: "1",
					origin: "Szeged",
					destination: "Budapest"
				])
				headers {
					 header('Content-Type': value(
							 producer(regex('application/vnd.route.v1.json.*')),
							 consumer('application/vnd.route.v1+json'))
					 )
				}
			}
}
