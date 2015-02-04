(ns app
	(:require [om.core :as om]
					  [om.dom :as d]))

(defonce app-state (atom {:greeting "Hello again, immutable data?"}))

(.log js/console "this doesn't get executed")

(om/root
	(fn [app-state owner]
		(reify
			om/IRender
			(render [_]
				(d/h1 nil (:greeting app-state)))))
	app-state
	{:target (. js/document (getElementById "app"))})
