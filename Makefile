%.class: %.scala
	scalac $<
%: %.class
	scala -cp $< $@
