"""Hello unit test module."""

from pipeline_python.hello import hello


def test_hello():
    """Test the hello function."""
    assert hello() == "Hello pipeline-python"
